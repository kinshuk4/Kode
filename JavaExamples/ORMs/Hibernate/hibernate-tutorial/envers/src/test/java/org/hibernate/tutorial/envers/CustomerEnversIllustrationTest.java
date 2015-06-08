/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.tutorial.envers;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;

/**
 * Illustrates the set up and use of Envers.
 * <p>
 * This example is different from the others in that we really need to save multiple revisions to the entity in
 * order to get a good look at Envers in action.
 *
 * @author Steve Ebersole
 */
public class CustomerEnversIllustrationTest extends TestCase {
    private EntityManagerFactory entityManagerFactory;

    @Override
    protected void setUp() throws Exception {
        // like discussed with regards to SessionFactory, an EntityManagerFactory is set up once for an application
        // 		IMPORTANT: notice how the name here matches the name we gave the persistence-unit in persistence.xml!
        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.envers" );
    }

    @Override
    protected void tearDown() throws Exception {
        entityManagerFactory.close();
    }

    public void testBasicUsage() {
        // create a couple of events
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist( new Customer("Durga", "Velagapudi" ) );
        entityManager.persist( new Customer("Sujala", "Velagapudi" ) );
        entityManager.getTransaction().commit();
        entityManager.close();

        // now lets pull events from the database and list them
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Customer> result = entityManager.createQuery( "from Customer", Customer.class ).getResultList();
        for ( Customer customer : result ) {
            System.out.println(customer);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

        // so far the code is the same as we have seen in previous tutorials.  Now lets leverage Envers...

        // first lets create some revisions
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Customer myCustomer = entityManager.find( Customer.class, 2L ); // we are using the increment generator, so we know 2 is a valid id
        myCustomer.setLastName( "Kommana" );
        entityManager.getTransaction().commit();
        entityManager.close();

        // and then use an AuditReader to look back through history
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        myCustomer = entityManager.find( Customer.class, 2L );
        assertEquals( "Kommana", myCustomer.getLastName() );

        AuditReader reader = AuditReaderFactory.get( entityManager );
        Customer firstRevision = reader.find( Customer.class, 2L, 1 );
        assertFalse( firstRevision.getLastName().equals( myCustomer.getLastName() ) );

        Customer secondRevision = reader.find( Customer.class, 2L, 2 );

        assertTrue( secondRevision.getLastName().equals( myCustomer.getLastName() ) );
        assertTrue( secondRevision.getLastName().equals( myCustomer.getLastName() ) );
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
