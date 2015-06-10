package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Copyright (c) 2008 Morgan Stanley & Co. Incorporated, All Rights Reserved
 *
 * Unpublished copyright.  All rights reserved.  This material contains
 * proprietary information that shall be used or copied only within 
 * Morgan Stanley, except with written permission of Morgan Stanley.
 */

public class H2Test
{
  public static void main( String args[] ) throws Exception
  {
    Class.forName( "org.h2.Driver" );
    Connection conn = null;
    Statement stmt = null;

    try
    {
      conn = DriverManager.getConnection( "jdbc:h2:file:db/test", "sa", "" );
      stmt = conn.createStatement();
      stmt.executeUpdate( "create table test(col1 varchar(10));" );
    }
    catch( Exception e )
    {
      e.printStackTrace();
    }
    finally
    {
      if( stmt != null )
      {
        try
        {
          stmt.close();
          System.out.println("Test done");
        }
        catch( Exception e )
        {
          e.printStackTrace();
        }
      }

      if( conn != null )
      {
        conn.close();
      }

    }

  }
}
