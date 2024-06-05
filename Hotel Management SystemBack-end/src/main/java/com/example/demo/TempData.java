package com.example.demo;

import java.sql.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TempData {
	
	Date checkIn;
	Date checkOut;
	long totaldays;
	
	List tempData= new ArrayList();
	
	public List dayCalculation() {
		long difference=checkOut.getTime()-checkIn.getTime();
		totaldays=TimeUnit.MILLISECONDS.toDays(difference) % 365;
		System.out.println(totaldays);
		tempData.add(checkIn);
		tempData.add(checkOut);
		tempData.add(totaldays);
		return tempData;
	}

}
