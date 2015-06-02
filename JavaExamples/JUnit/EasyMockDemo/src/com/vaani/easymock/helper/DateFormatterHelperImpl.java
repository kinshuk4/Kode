package com.vaani.easymock.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatterHelperImpl 
implements DateFormatterHelper {

	public DateFormatterHelperImpl() {
	}

	public DateFormat getDateFormat(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setCalendar(Calendar.getInstance());
		sdf.setLenient(false);
		return sdf;
	}


	public static void main(String args[]) {
		DateFormatterHelper helper = new DateFormatterHelperImpl();
		try {
			System.out.println(helper.
					getDateFormat("MM/dd/yyyy").parse("11/27/2008"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
