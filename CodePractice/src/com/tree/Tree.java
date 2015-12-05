package com.tree;

import java.util.Stack;

// Print tree as we see

public class Tree {

	public static int rootData = 0;

	Stack<TreeNode> globalStack = new Stack<TreeNode>();

	public TreeNode root;

	public void insertNode(int i) {
		if (root == null) {
			root = new TreeNode(i);
		} else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {
				parent = current;
				if (i < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = new TreeNode(i);
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = new TreeNode(i);
						return;
					}
				}

			}
		}

	}
	
	public void riverse(TreeNode node) {
		if (node != null) {
			riverse(node.right);
			System.out.print(" " + node.data + " ");
			riverse(node.left);
		}
	}
	
	
	public void inorder(TreeNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(" " + node.data + " ");
			inorder(node.right);
		}
	}

	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out
				.println("\n......................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');

			while (globalStack.isEmpty() == false) {
				TreeNode temp = (TreeNode) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.left);
					localStack.push(temp.right);

					if (temp.left != null || temp.right != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		} // end while isRowEmpty is false
		System.out
				.println("......................................................");
	} // end displayTree()

	public void preOrder(TreeNode node) {
		if (node != null) {
			System.out.print(" -- " + node.data + " -- ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[] args) {
		rootData = 10;
		Tree tree = new Tree();
		tree.insertNode(10);
		tree.insertNode(5);
		tree.insertNode(4);
		tree.insertNode(8);
		tree.insertNode(7);
		tree.insertNode(9);
		tree.insertNode(15);
		tree.insertNode(14);
		tree.insertNode(20);
		tree.insertNode(17);
		tree.insertNode(21);
		// tree.inorder(tree.root);
		tree.display();
		 System.out.println( isBST(tree.root) );
		 System.exit(0);
		tree = new Tree();
		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(5);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(8);
		tree.root.left.right.left = new TreeNode(7);
		tree.root.left.right.right = new TreeNode(9);
		tree.root.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(18);
		tree.root.right.left.left = new TreeNode(9);
		tree.root.right.left.right = new TreeNode(7);

		tree.root.right.right = new TreeNode(4);

		// tree.inorder(tree.root);
		tree.display();
		System.out.println("======== "
				+ isMirror(tree.root.left, tree.root.right));
		// tree.preOrder(tree.root);
	}

	public void display() {
		boolean isrow = false;
		int blank = 32;

		Stack<TreeNode> global = new Stack<TreeNode>();
		System.out.println("\n\n--------------------------\n\n");
		global.push(root);
		while (isrow == false) {
			for (int i = 0; i < blank; i++) {
				System.out.print(" ");
			}
			Stack<TreeNode> local = new Stack<TreeNode>();
			isrow = true;
			while (global.empty() == false) {
				TreeNode current = global.pop();
				if (current != null) {
					System.out.print(current.data);
					local.push(current.left);
					local.push(current.right);
					if (current.left != null || current.right != null) {
						isrow = false;
					}
				} else {
					System.out.print(" _");
					local.push(null);
					local.push(null);
				}
				for (int i = 0; i < blank * 2 - 2; i++) {
					System.out.print(" ");
				}
			}
			blank /= 2;
			System.out.println(" ");
			while (!local.empty())
				global.push(local.pop());
		}

	}
	public static int isBST(TreeNode current) {
		if (current == null)
			return 0;
		if (current.left != null && current.left.data > current.data)
			return 0;
		if (current.right != null && current.right.data < current.data)
			return 0;
		if (!(isBST(current.left) == 0) || !(isBST(current.right) == 0))
			return 0;
		return 1;
	}

	public static int isMirror(TreeNode leftNode, TreeNode rightNode) {

		if (leftNode != null && rightNode != null)
			if (leftNode.data != rightNode.data)
				return 0;

		if (leftNode.left == null && rightNode.right == null)
			return 1;

		if (leftNode.right == null && rightNode.left == null)
			return 1;

		if ((isMirror(leftNode.left, rightNode.right) == 1)
				|| (isMirror(leftNode.right, rightNode.left) == 1))
			return 0;

		return 1;

	}

}
