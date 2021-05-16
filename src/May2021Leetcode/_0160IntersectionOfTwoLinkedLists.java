package May2021Leetcode;

public class _0160IntersectionOfTwoLinkedLists {
	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		ListNode ln1 = new ListNode(4);
		ln1.next = new ListNode(1);
		ln1.next.next = new ListNode(8);
		ln1.next.next.next = new ListNode(4);
		ln1.next.next.next.next = new ListNode(5);
		ListNode ln2 = new ListNode(5);
		ln2.next = new ListNode(6);
		ln2.next.next = new ListNode(2);
		ln2.next.next.next = ln1.next.next;
		System.out.println(getIntersectionNode(ln1, ln2).val);

		ln1 = new ListNode(1);
		ln1.next = new ListNode(9);
		ln1.next.next = new ListNode(1);
		ln1.next.next.next = new ListNode(2);
		ln1.next.next.next.next = new ListNode(54);
		ln2 = new ListNode(3);
		ln2.next = ln1.next.next.next;
		System.out.println(getIntersectionNode(ln1, ln2).val);

		ln1 = new ListNode(2);
		ln1.next = new ListNode(6);
		ln1.next.next = new ListNode(4);
		ln2 = new ListNode(1);
		ln2.next = new ListNode(5);
		System.out.println(getIntersectionNode(ln1, ln2));
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		int lengthA = getLength(headA);
		int lengthB = getLength(headB);

		if (lengthA > lengthB) {
			int diff = lengthA - lengthB;
			while (diff > 0) {
				headA = headA.next;
				diff--;
			}
		} else if (lengthB > lengthA) {
			int diff = lengthB - lengthA;
			while (diff > 0) {
				headB = headB.next;
				diff--;
			}
		}

		while (headA != null && headB != null && headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

	public static int getLength(ListNode head) {
		if (head == null)
			return 0;
		return 1 + getLength(head.next);
	}
}
