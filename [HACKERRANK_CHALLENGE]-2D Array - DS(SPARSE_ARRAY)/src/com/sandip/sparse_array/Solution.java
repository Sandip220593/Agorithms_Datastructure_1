/*
 * problem link is given below:
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 * 
 * */
package com.sandip.sparse_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {

	public static FastReader s = new FastReader();

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = s.nextInt();
		while (n-- > 0) {
			String str = s.next();
			if (!map.containsKey(str))
				map.put(str, 1);
			else
				map.put(str, map.get(str) + 1);
		}
		int m = s.nextInt();
		int res[] = new int[m];
		int index = 0;
		while (m-- > 0) {
			String str1 = s.next();
			if (map.containsKey(str1)) {
				res[index++] = map.get(str1);
			} else {
				res[index++] = 0;
			}
		}
		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
