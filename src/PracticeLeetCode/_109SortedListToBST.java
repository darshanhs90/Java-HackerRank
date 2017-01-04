package PracticeLeetCode;

public class _109SortedListToBST {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		ListNode ln1=new ListNode(1);
		sortedListToBST(ln1);
	}
	static ListNode ln;
	public static TreeNode sortedListToBST(ListNode head) {
		if(head==null)
			return null;
		ln=head;
		return convertTree(0,getLength(head)-1);
	}
	private static TreeNode convertTree(int left, int right) {
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode leftNode=convertTree(left, mid-1);
		TreeNode tn=new TreeNode(ln.val);
		ln=ln.next;
		TreeNode rightNode=convertTree(mid+1, right);		
		tn.left=leftNode;
		tn.right=rightNode;
		return tn;
	}
	private static int getLength(ListNode head) {
		return head==null?0:1+getLength(head.next);
	}
}
