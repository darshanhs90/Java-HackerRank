package May2021GoogLeetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _0767ReorganizeString {

	public static void main(String[] args) {
		System.out.println(reorganizeString("aab"));
		System.out.println(reorganizeString("aaab"));
	}

	static class Pair {
		char c;
		int count;

		public Pair(char c, int count) {
			this.c = c;
			this.count = count;
		}
	}

	public static String reorganizeString(String S) {
		
	}
}
