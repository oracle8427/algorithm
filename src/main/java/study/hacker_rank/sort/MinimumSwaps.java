package study.hacker_rank.sort;

public class MinimumSwaps {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != (i + 1)) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
				count++;
				// System.out.println("[" + i + "]" +arr[i] + "!=" +( i + 1) + " => " + arr[arr[i]-1]);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] arrays = {
				new int[] {4, 3, 1, 2},
				new int[] {2, 3, 4, 1, 5},
				new int[] {1, 3, 5, 2, 4, 6, 7},
				new int[] {1, 5, 4, 6, 2, 3, 8, 9, 7, 11, 10}
		};
		StringBuilder sb = new StringBuilder();
		for (int[] arr : arrays) {
			sb.append("[");
			for (int i : arr)
				sb.append(i).append(" ");
			sb.append("] => ");
			int cnt = minimumSwaps(arr);
			System.out.println(sb.append(cnt).toString());
			sb.setLength(0);
		}
	}

}
