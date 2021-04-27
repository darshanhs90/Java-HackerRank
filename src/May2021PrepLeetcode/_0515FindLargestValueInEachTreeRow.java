package May2021PrepLeetcode;

import java.util.List;

public class _0515FindLargestValueInEachTreeRow {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(3);
		tn.right = new TreeNode(2);

		tn.left.left = new TreeNode(5);
		tn.left.right = new TreeNode(3);
		tn.right.right = new TreeNode(9);
		System.out.println(largestValues(tn));
	}

	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static List<Integer> largestValues(TreeNode root) {

	}

}
