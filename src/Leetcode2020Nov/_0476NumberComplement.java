package Leetcode2020Nov;

public class _0476NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
		System.out.println(findComplement(1));
	}

	public static int findComplement(int num) {
		return num << 1 | 1;
	}
}
