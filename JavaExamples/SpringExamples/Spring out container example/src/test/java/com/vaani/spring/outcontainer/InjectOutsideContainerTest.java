package com.vaani.spring.outcontainer;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.vaani.spring.outcontainer.DomainObject;
import com.vaani.spring.outcontainer.Injectable;


/**
 * Test class to verify Spring ability to inject dependencies into non-managed
 * instances.
 * 
 * @author Nicolas Frankel
 */
@ContextConfiguration(locations = "classpath:beans.xml")
public class InjectOutsideContainerTest extends
		AbstractJUnit4SpringContextTests {

	private DomainObject domainObject;

	/**
	 * Creates a new instance of a domain object.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		domainObject = new DomainObject();
	}

	@Test
	public void test() {

		Injectable injectable = domainObject.getInjectable();

		assertNotNull(injectable);
	}
}
