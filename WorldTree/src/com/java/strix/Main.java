package com.java.strix;

public class Main {

	public static void main(String[] args) { //новый комментарий

		Tree tree = new Tree();
/*
 * ещё комментарий тут
 */
		while (tree.getBranchesCount() < 10) {
			tree.grow();
		}

		System.out.println(tree.getTreeInfo());

	}

}
