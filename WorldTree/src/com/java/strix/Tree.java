package com.java.strix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.java.strix.branch.Branch;
import com.java.strix.branch.SimpleBranch;

public class Tree {

	private static final Random RANDOM = new Random(System.currentTimeMillis());

	List<Branch> branches;

	public Tree() {
		this.branches = new ArrayList<>();
	}

	public int getBranchesCount() {
		return branches.size();
	}

	public void populateBranch() {
		this.branches.add(new SimpleBranch());
	}

	public void grow() {
		long rand = RANDOM.nextInt();
		// В каждом 10 случае или если ветвей ещё нет - отращиваем ветвь
		if (rand % 10 == 0 || getBranchesCount() == 0) {
			populateBranch();
		} else {
			// Берём случайную ветвь
			Branch branch = branches.get(RANDOM.nextInt(getBranchesCount()));
			branch.populateLeave();
		}
	}

	public String getTreeInfo() {
		int leavesCount = 0;
		for (Branch branch : branches) {
			leavesCount += branch.getLeavesCount();
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Branches count: ").append(getBranchesCount()).append(";\r\n")
		.append("Leaves count: ").append(leavesCount).append(";\r\n");

		return sb.toString();
	}

}
