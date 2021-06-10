package study.hacker_rank.arr;

public class ArrayRotation {
	public static int[] solution(int[] A, int K) {
		if (K <= 0 || A.length == 0)
			return A;

		if (K % A.length == 0)
			return A;

		if (K > A.length)
			K = K % A.length;

		final int length = A.length;
		int[] resultArray = new int[length];

		final int pivot = length - K; // 4- 4
		for (int i = pivot; i < length; i++) {
			// System.out.println(i - pivot);
			resultArray[i - pivot] = A[i];
		}

		for (int i = 0; i < pivot; i++) {
			resultArray[i + K] = A[i];
		}

		System.out.println();
		return resultArray;
	}

	public static void main(String[] args) {
		int cnt = 3;
		int[] array = { 3, 8, 9, 7, 6, 8, 10, 11 };

		for (int i : solution(array, cnt))
			System.out.print(i + " ");

	}
}
