package com.java.strix;

import java.util.Scanner; //����������� ������ ����� � �����

public class Reader {
	private int t, s;

	public int getT() {
		return t;
	}

	public int getS() {
		return s;
	}

	public void scan() {
		System.out.println("������� ������ �����");
		Scanner scn = new Scanner(System.in); // ��-�� ���� ��� "!"?
		t = scn.nextInt();
		System.out.println("������� ������ �����");
		s = scn.nextInt();
		scn.close(); // ��� ����� �� �������
	}
}
