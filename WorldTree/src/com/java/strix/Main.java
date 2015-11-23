package com.java.strix;

import com.java.strix.example.Keyboard;
import com.java.strix.example.Monitor;
import com.java.strix.example.Mouse;
import com.java.strix.example.PC;
import com.java.strix.example.SystemUnit;

public class Main {

	/**
	 * Ctrl + Shift + L
	 * @param args
	 */
	
	public static void main(String[] args) { // ����� �����������

		Tree tree = new Tree();
		/*
		 * ��� ����������� ���
		 */
		while (tree.getBranchesCount() < 10) {
			tree.grow();
		}

		int a = (int) Math.PI, b = 3;
		boolean t = false;
		boolean f = false;
		if (t == f) {
			System.out.println("@@@@@");
		}
		
		if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a == b) {
			System.out.println(a + "=" + b);
		} else {
			System.out.println(a + "<" + b);
		}

		// System.out.println(tree.getTreeInfo());
		String aString = "�� ������ ������";
		System.out.println(Formatter.makePrettyLookingString("���".concat(" ").concat(aString)));
		System.out.println(Formatter.makePrettyLookingString("��� ����������������� ������!", "-%s - %d!"));

		PC pc = new PC(new SystemUnit("Intel"), new Monitor("Samsung"), new Keyboard("IBM"), new Mouse("Apple"));
		System.out.println(pc.getPCInfo());
		System.out.println(pc.sum(15, 10));
		pc = new PC(new SystemUnit("Intel"), new Monitor("NEC"), new Keyboard("IBM"), null);
		System.out.println(pc.getPCInfo());
		System.out.println(pc.sum(15, 10));

	}

}
