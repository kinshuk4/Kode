/*
 * Copyright (c) 2008 Morgan Stanley & Co. Incorporated, All Rights Reserved
 *
 * Unpublished copyright.  All rights reserved.  This material contains
 * proprietary information that shall be used or copied only within 
 * Morgan Stanley, except with written permission of Morgan Stanley.
 */

package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloTest
{
  public static void main( String args[] ) throws Exception
  {
    try
    {
      System.out.println( "please Wait." );
      Resource res = new ClassPathResource( "spring/springContext.xml" );
      BeanFactory factory = new XmlBeanFactory( res );
      Hello bean1 = ( Hello ) factory.getBean( "hello" );
      String s = bean1.sayhello( "Morgan Stanley" );
      System.out.println( s );
    }
    catch( Exception e1 )
    {
      e1.printStackTrace();
    }
  }
}