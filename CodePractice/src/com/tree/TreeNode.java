package com.tree;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		super();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRigth() {
		return right;
	}

	public void setRigth(TreeNode rigth) {
		this.right = rigth;
	}

	public TreeNode(int data, TreeNode left, TreeNode rigth) {
		super();
		this.data = data;
		this.left = left;
		this.right = rigth;
	}

	public TreeNode(int data) {
		this.data = data;
	}

}
