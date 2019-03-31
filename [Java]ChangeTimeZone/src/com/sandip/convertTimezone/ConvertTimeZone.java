package com.sandip.convertTimezone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertTimeZone {
	private static final String DATE_FORMAT="dd MMM yyyy hh:mm:ss a";
	
	public static String formatDate(Date dt, String fmt, String timeZone)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		return sdf.format(dt);
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("GMT Time : "+formatDate(date, DATE_FORMAT, "GMT"));
		System.out.println("DST Time : "+formatDate(date, DATE_FORMAT, "Europe/London"));
		String str[]=TimeZone.getAvailableIDs();
		/*for(String s:str)
			System.out.println(s);*/
	}

}
