package com.java.strix.branch;

import java.util.ArrayList;
import java.util.List;

import com.java.strix.leaf.Leaf;
import com.java.strix.leaf.SharpLeaf;

public class SimpleBranch implements Branch {

	private List<Leaf> leaves;

	public SimpleBranch() {
		this.leaves = new ArrayList<>();
	}

	@Override
	public void populateLeave() {
		this.leaves.add(new SharpLeaf());
	}

	@Override
	public int getLeavesCount() {
		return leaves.size();
	}

}
