package study.hacker_rank.arr;

import java.io.IOException;

public class HourglassSum {

	public static int hourglassSum(int[][] array) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int abc =	array[i][j] + 
							array[i][j + 1] + 
							array[i][j + 2];
				int d 	 = 	array[i + 1][j + 1];
				int efg =	array[i + 2][j] + 
							array[i + 2][j + 1] + 
							array[i + 2][j + 2];
				int sum = abc + d + efg;
				if (maxSum < sum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) throws IOException {

		int[][] array = { 
				new int[] { 1, 1, 1, 0, 0, 0 }, 
				new int[] { 0, 1, 0, 0, 0, 0 },
				new int[] { 1, 1, 1, 0, 0, 0 }, 
				new int[] { 0, 0, 2, 4, 4, 0 }, 
				new int[] { 0, 0, 0, 2, 0, 0 },
				new int[] { 0, 0, 1, 2, 4, 0 } 
		};

		System.out.println(hourglassSum(array));
	}

}
