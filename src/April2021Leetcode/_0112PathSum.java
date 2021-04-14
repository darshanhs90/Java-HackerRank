package April2021Leetcode;

public class _0112PathSum {
	public static class TreeNode {
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

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(4);
		tn.right = new TreeNode(8);
		tn.left.left = new TreeNode(11);
		tn.left.left.left = new TreeNode(7);
		tn.left.left.right = new TreeNode(2);
		tn.right.left = new TreeNode(13);
		tn.right.right = new TreeNode(4);
		tn.right.right.right = new TreeNode(1);
		System.out.println(hasPathSum(tn, 22));
	}

	static boolean hasSum;

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		hasSum = false;
		hasPathSum(root, 0, sum);
		return hasSum;
	}

	public static void hasPathSum(TreeNode root, int currSum, int sum) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			if (currSum + root.val == sum) {
				hasSum = true;
			}
			return;
		}
		hasPathSum(root.left, currSum + root.val, sum);
		hasPathSum(root.right, currSum + root.val, sum);
	}
}
