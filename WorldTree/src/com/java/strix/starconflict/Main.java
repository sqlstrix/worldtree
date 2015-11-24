package com.java.strix.starconflict;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		
		Calendar calendar = Calendar.getInstance();
		
		
		EmpireEngineer ee = new EmpireEngineer(1000, 35, "Sky", 500, calendar.getTime());

		
		System.out.println(ee.toString());
		
		System.out.println(ee.heal());
		ee.setHp(0);
		System.out.println(ee.heal());
	}

}
