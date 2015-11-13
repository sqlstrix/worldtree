package com.java.strix;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree();

		while (tree.getBranchesCount() < 10) {
			tree.grow();
		}

		System.out.println(tree.getTreeInfo());

	}

}
