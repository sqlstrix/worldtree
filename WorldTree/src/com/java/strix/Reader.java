package com.java.strix;

import java.util.Scanner;  //����������� ������ ����� � �����

public class Reader {
	int t;
	int s;

	public void Scan() {
		System.out.println("����� �����");
		Scanner scn = new Scanner(System.in);  //��-�� ���� ��� "!"?
		t = scn.nextInt();
		System.out.println("����� ��� �����");
		s = scn.nextInt();
	}
}
