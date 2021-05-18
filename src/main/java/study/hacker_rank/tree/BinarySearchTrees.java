package study.hacker_rank.tree;

import java.util.Stack;

import study.hacker_rank.Node;

public class BinarySearchTrees {

	public static int maxHight = 0;

	public static int getHeight(Node root) {
		if (root == null)
			return 0;
		int height = 0;
		height = preorder(root, 0);
		// height = iterativePreorder(root);
		// height = inorder(root, 0);
		// height = iterativeInorder(root);
		// height = postorder(root, 0);
		// height = iterativePostOrder(root);
		return height;
	}

	// Pre-order, NLR
	public static int preorderMaxHight = 0;
	public static int preorder(Node node, int height) {
		if (node == null)
			return 0;

		if (preorderMaxHight < height)
			preorderMaxHight = height;
		preorder(node.left, height + 1);
		preorder(node.right, height + 1);

		return preorderMaxHight;
	}

	public static int iterativePreorder(Node root) {
		if (root == null)
			return 0;

		int maxHeight = 0;
		int height = 0;

		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			height++;
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);

			if (node.right == null && node.left == null) {
				if (maxHeight < height) {
					maxHeight = height;
				}
				height = 0;
			}
		}
		return maxHeight;
	}

	// In-order, LNR
	public static int inorderMaxHight = 0;
	public static int inorder(Node node, int height) {
		if (node == null)
			return 0;
		inorder(node.left, height + 1);
		if (inorderMaxHight < height)
			inorderMaxHight = height;
		inorder(node.right, height + 1);
		return inorderMaxHight;
	}

	public static int iterativeInorder(Node node) {
		if (node == null)
			return 0;

		int maxHeight = 0;
		int height = 0;
		Stack<Node> stack = new Stack<>();
		while (!stack.isEmpty() || node != null) {

			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				height++;
				node = node.right;
				if (node == null) {
					if (maxHeight < height) {
						maxHeight = height;
					}
					height = 0;
				}
			}
		}
		return maxHeight;
	}

	// Post-order, LRN
	public static int postMaxHight = 0;
	public static int postorder(Node node, int height) {
		if (node == null)
			return 0;
		postorder(node.left, height + 1);
		postorder(node.right, height + 1);
		if (height > postMaxHight)
			postMaxHight = height;
		return postMaxHight;
	}

	public static int iterativePostOrder(Node node) {
		if (node == null)
			return 0;
		int maxHeight = 0;
		int height = 0;
		Stack<Node> stack = new Stack<>();
		Node lastNode = null;
		while (!stack.isEmpty() || node != null) {

			if (node != null) {
				height++;
				stack.push(node);
				node = node.left;
			} else {
				Node peekNode = stack.peek();
				if (peekNode.right != null && lastNode != peekNode.right) {
					node = peekNode.right;
				} else {
					if (maxHeight < height) {
						maxHeight = height;
					}
					height = 0;
					lastNode = stack.pop();
				}
			}
		}
		return maxHeight;
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
		int[] arr = new int[] { 3, 5, 2, 1, 4, 6, 7 };
		Node root = null;
		for (int i : arr) {
			root = insert(root, i);
		}
		int height = getHeight(root);
		System.out.println("Result: " + height);
	}

}
