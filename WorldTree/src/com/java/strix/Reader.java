package com.java.strix;

import java.util.Scanner; //импортируем захват ввода с клавы

public class Reader {
	private int t, s;

	public int getT() {
		return t;
	}

	public int getS() {
		return s;
	}

	public void scan() {
		System.out.println("¬ведите первое число");
		Scanner scn = new Scanner(System.in); // из-за чего тут "!"?
		t = scn.nextInt();
		System.out.println("¬ведите второе число");
		s = scn.nextInt();
		scn.close(); // вот этого не хватало
	}
}
