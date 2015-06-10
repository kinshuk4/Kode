/*
 * Copyright (c) 2008 Morgan Stanley & Co. Incorporated, All Rights Reserved
 *
 * Unpublished copyright.  All rights reserved.  This material contains
 * proprietary information that shall be used or copied only within 
 * Morgan Stanley, except with written permission of Morgan Stanley.
 */

package spring;

public class HelloImpl implements Hello

{

  private String greeting;

  public HelloImpl()

  {

  }

  public HelloImpl( String a )

  {

    greeting = a;

  }

  public String sayhello( String s )

  {

    return greeting + s;

  }

  public void setGreeting( String a )

  {

    greeting = a;

  }

}