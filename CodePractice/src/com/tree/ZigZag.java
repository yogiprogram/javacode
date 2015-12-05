package com.tree;

import java.util.Stack;

public class ZigZag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(10);
		tree.insertNode(5);
		tree.insertNode(4);
		tree.insertNode(8);
		tree.insertNode(7);
		tree.insertNode(9);
		tree.insertNode(15);
		tree.insertNode(20);
		tree.insertNode(17);
		tree.insertNode(21);
		tree.riverse(tree.root);
		//tree.inorder(tree.root);
		// tree.display();
		// tree.preOrder(tree.root);

		//zigzagprint(tree.root);
		
	}

	private static void riverse(TreeNode root) {
		
	}

	public static void zigzagprint(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		Stack<TreeNode> temp = new Stack<TreeNode>();
		boolean isZizag = true;
		st.push(root);
		while (!st.isEmpty()) {
			while (!st.isEmpty()) {
				TreeNode node = st.pop();
				System.out.print(" " + node.data + " ");
				if (!isZizag) {
					if (node.left != null)
						temp.push(node.left);
					if (node.right != null)
						temp.push(node.right);
				} else {
					if (node.right != null)
						temp.push(node.right);
					if (node.left != null)
						temp.push(node.left);
				}
			}
			st = (Stack<TreeNode>) temp.clone();
			temp.clear();
			isZizag = !isZizag;
			System.out.println();
		}

	}

}
