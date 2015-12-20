package com.java.strix;

import java.util.Scanner;  //импортируем захват ввода с клавы

public class Reader {
	int t;
	int s;

	public void Scan() {
		System.out.println("¬веди число");
		Scanner scn = new Scanner(System.in);  //из-за чего тут "!"?
		t = scn.nextInt();
		System.out.println("¬веди еще число");
		s = scn.nextInt();
	}
}
