/*
 * Problem link is given below : 
 * https://www.hackerrank.com/challenges/2d-array/problem
 * 
 **/

package com.sandip.hourglass;

import java.util.*;

public class Solution {
	public static final int ROW = 6;
	public static final int COL = 6;
	public static int maxSum = -63;
	public static final int WIDTH = 2;
	public static int arr[][] = new int[ROW][COL];

	public static void hourglass(int i, int j) {
		int temp = 0;
		for (int k = j; k <= j + WIDTH; k++) {
			temp += arr[i][k];
			temp += arr[i + WIDTH][k];
		}

		temp += arr[i + 1][j + 1];
		if (maxSum < temp)
			maxSum = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ROW; i++)
			for (int j = 0; j < COL; j++)
				arr[i][j] = sc.nextInt();
		for (int i = 0; i < ROW - WIDTH; i++)
			for (int j = 0; j < COL - WIDTH; j++)
				hourglass(i, j);

		System.out.println(maxSum);
	}
}
