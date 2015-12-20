package com.java.strix;

import com.java.strix.Reader; //добавлен ипморт класса Reader
//import com.java.strix.example.Keyboard;
//import com.java.strix.example.Monitor;
//import com.java.strix.example.Mouse;
//import com.java.strix.example.PC;
//import com.java.strix.example.SystemUnit;

public class Main {

	/**
	 * Ctrl + Shift + L
	 * 
	 * @param args
	 */

	public static void main(String[] args) { // новый комментарий

		Tree tree = new Tree();
		while (tree.getBranchesCount() < 10) {
			tree.grow();
		}
		
		// новый фрагмент A 2015 12 20
		Reader r = new Reader();
		r.scan();
		// конец нового фрагмента A
		
		// int a = (int) Math.PI, b = 8; (старое)
		// int a = (int) r.t, b = r.s;
		int a = r.getT();
		int b = r.getS();
		boolean t = true;
		boolean f = false;
		if (t == f) {
			System.out.println("Новая строка");
		}

		if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a == b) {
			System.out.println(a + "=" + b);
		} else {
			System.out.println(a + "<" + b);
		}

		// System.out.println(tree.getTreeInfo());
		// String aString = "на уровне ГрунтА";
		// System.out.println(Formatter.makePrettyLookingString("эТо".concat("
		// ").concat(aString)));
		// System.out.println(Formatter.makePrettyLookingString("Это
		// отформатированная строка!", "-%s - %d!"));

		// PC pc = new PC(new SystemUnit("Intel"), new Monitor("Samsung"), new
		// Keyboard("IBM"), new Mouse("Apple"));
		// System.out.println(pc.getPCInfo());
		// System.out.println(pc.sum(15, 10));
		// pc = new PC(new SystemUnit("Intel"), new Monitor("NEC"), new
		// Keyboard("IBM"), null);
		// System.out.println(pc.getPCInfo());
		// System.out.println(pc.sum(15, 10));

	}

}
