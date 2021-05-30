package study.hacker_rank.list;

public class MoreLinkedLists {

	public static Node removeDuplicates(Node head) {
		if (head == null)
			return null;

		Node node = head;
		while (node != null) {

			if (node.next != null && node.data == node.next.data) {
				// System.out.println(node.data + "==" + node.next.data);
				if (node.next.next == null)
					node.next = null;
				else
					node.next = node.next.next;
				continue;
			}
			node = node.next;
		}
		return head;

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		int[] testCase = { 1, 2, 2, 3, 3, 4 };
		Node head = null;
		for (int i : testCase) {
			head = insert(head, i);
		}
		head = removeDuplicates(head);
		display(head);

	}
}
