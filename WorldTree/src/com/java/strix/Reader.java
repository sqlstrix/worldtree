package com.java.strix;
//импортируем захват ввода с клавы
import java.util.Scanner;

public class Reader {
	// целочисленные переменные t
	int t;
	int s;

	public void Scan() {
		System.out.println("¬веди число");
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		System.out.println("¬веди еще число");
		s = scn.nextInt();
	}
}
