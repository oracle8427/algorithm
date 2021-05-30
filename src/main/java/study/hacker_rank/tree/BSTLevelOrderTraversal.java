package study.hacker_rank.tree;

import java.util.LinkedList;

public class BSTLevelOrderTraversal {

	static void levelOrder(Node node) {
		if (node == null)
			return;

		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			node = queue.poll();
			System.out.print(node.data + " ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		int[] array = new int[] { 3, 2, 5, 1, 4, 7 };

		Node root = null;
		for (int data : array) {
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
