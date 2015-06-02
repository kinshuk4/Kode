package com.vaani.easymock.testee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaani.easymock.helper.DateFormatterHelper;

public class DateFormatter {
	public static final String DATE_FORMAT = "MM/dd/yyyy";

	private DateFormatterHelper helper = null;

	public DateFormatter() {
	}

	public String convertToStandardFormat(String dateString, String format)
			throws ParseException {
		if (dateString == null || dateString.equals(""))
			return "";
		dateString = dateString == null ? "" : dateString;
		DateFormat df = helper.getDateFormat(format);
		Date date = df.parse(dateString);
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(date);
	}

	public DateFormatterHelper getHelper() {
		return helper;
	}

	public void setHelper(DateFormatterHelper helper) {
		this.helper = helper;
	}
}
