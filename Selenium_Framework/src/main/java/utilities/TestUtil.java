package utilities;

import java.util.*;

import org.openqa.selenium.By;

import base.BaseTC;

public class TestUtil extends BaseTC {
	
	public static String DepartureDate;
	public static String RetureDate;

	public static TestUtil getCurrentAndRetureDate() {
		
		TestUtil date = new TestUtil();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1); // Add next day date
		
		String[] dateArr = cal.getTime().toString().split(" ");
		TestUtil.DepartureDate = dateArr[0]+""+dateArr[1]+""+dateArr[2]+""+dateArr[5];
		
		cal.add(Calendar.DATE, 2);
		dateArr = cal.getTime().toString().split(" ");
		TestUtil.RetureDate = dateArr[0]+""+dateArr[1]+""+dateArr[2]+""+dateArr[5];
		
		return date;
	}
	
	public static By customeXpath(String xpath, String parm) {
		
		String rawpath = xpath.replaceAll("%replace%", parm);
		return By.xpath(rawpath);
	}
}
