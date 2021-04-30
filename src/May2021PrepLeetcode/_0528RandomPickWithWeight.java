package May2021PrepLeetcode;

public class _0528RandomPickWithWeight {
	public static void main(String[] args) {
		Solution solution = new Solution(new int[] { 1 });
		System.out.println(solution.pickIndex()); // return 0. Since there is only one single element on the array the
													// only option is to return the first element.

		solution = new Solution(new int[] { 1, 3 });
		System.out.println(solution.pickIndex());
		System.out.println(solution.pickIndex());
		System.out.println(solution.pickIndex());
		System.out.println(solution.pickIndex());
		System.out.println(solution.pickIndex());
	}

	static class Solution {
		int totalSum;
		int[] w;

		public Solution(int[] w) {
			int sum = 0;
			for (int i = 0; i < w.length; i++) {
				sum += w[i];
				w[i] = sum;
			}
			totalSum = sum;
			this.w = w;
		}

		public int pickIndex() {
			double val = Math.random() * totalSum;
			for (int i = 0; i < w.length; i++) {
				if (val < w[i])
					return i;
			}
			return w.length - 1;
		}
	}

}
