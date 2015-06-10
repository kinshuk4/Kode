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

public class SybaseTest
{
  public static void main( String args[] ) throws Exception
  {
    Class.forName( "com.sybase.jdbc3.jdbc.SybDriver" );
    Connection conn = null;
    Statement stmt = null;

    try
    {
//      Server : BYT_TRG (bycydb03:7273)
//      DB Name: pubs2
//
//      Username: trgn1
//      Password: trgn01
//
//      Username: trgn2
//      Password: trgn02
      
      conn = DriverManager.getConnection( "jdbc:sybase:Tds:bycydb03:7273/pubs2", "trgn1", "trgn01" );
      stmt = conn.createStatement();
      stmt.executeUpdate( "create table TestRk(col1 varchar(10))" );
      //stmt.executeUpdate( "drop table TestRk" );
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
