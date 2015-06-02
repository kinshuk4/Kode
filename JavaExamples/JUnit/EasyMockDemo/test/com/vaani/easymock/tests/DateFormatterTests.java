package com.vaani.easymock.tests;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vaani.easymock.helper.DateFormatterHelper;
import com.vaani.easymock.testee.DateFormatter;


public class DateFormatterTests {

  private DateFormatter formatter = null;

  DateFormatterHelper helper = null;

  @Before
  public void setUp() throws Exception {
    helper = EasyMock.createMock(DateFormatterHelper.class);
    formatter = new DateFormatter();
    formatter.setHelper(helper);
  }

  @Test
  public void testConvertToStandardFormat() {
    
    String formatted = null;
    try {
      EasyMock.expect(helper.getDateFormat("MM-dd-yyyy"))
            .andReturn(new SimpleDateFormat("MM-dd-yyyy"));
      EasyMock.replay(helper);
      formatted = formatter.
               convertToStandardFormat("11-27-2008", "MM-dd-yyyy");
    } catch (ParseException e) {
      e.printStackTrace();
      fail("Exception");
    }
    Assert.assertEquals(formatted, "11/27/2008");

  }
}