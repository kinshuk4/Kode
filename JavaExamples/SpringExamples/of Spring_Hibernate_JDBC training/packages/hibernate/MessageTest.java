/*
 * Copyright (c) 2008 Morgan Stanley & Co. Incorporated, All Rights Reserved
 *
 * Unpublished copyright.  All rights reserved.  This material contains
 * proprietary information that shall be used or copied only within 
 * Morgan Stanley, except with written permission of Morgan Stanley.
 */

package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author nradhakr on Dec 31, 2008 @ 2:54:29 PM
 * @version $Revision:$, submitted by $Author:$
 */
public class MessageTest
{
  private static SessionFactory sessionFactory;

  private static void createSessionFactory()
  {
    sessionFactory = new Configuration()
        .configure( "/hibernate/example.cfg.xml" )
        .buildSessionFactory();
  }

  private static SessionFactory getSessionFactory()
  {
    return sessionFactory;
  }
  
  private static void closeSessionFactory()
  {
    sessionFactory.close();
  }

  @SuppressWarnings("unchecked")
  public static void main( String args[] )
  {
    createSessionFactory();
    Session session = getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    Message message = new Message( "Hello World" );
    session.save( message );
    tx.commit();
    session.close();
    
    Session newSession = getSessionFactory().openSession();
    Transaction newTransaction = newSession.beginTransaction();
    List messages =
    newSession.createQuery("from Message as m order by m.text asc").list();
    System.out.println( messages.size() + " message(s) found:" );
    for ( Iterator iter = messages.iterator(); iter.hasNext(); ) {
    message = (Message) iter.next();
    System.out.println( message.getText() );
    }
    newTransaction.commit();
    newSession.close();
    
    closeSessionFactory();
  }
}
