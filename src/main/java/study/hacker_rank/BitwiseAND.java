package study.hacker_rank;

public class BitwiseAND {

	public static int bitwiseAnd(int N, int K) {
		int max = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				int bitwise = i & j;
				// System.out.println("A = " + i + ", B = " + j + "; A & B = " + bitwise);
				if (bitwise > max && bitwise < K)
					max = bitwise;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] counts = { 5, 8, 2 };
		int[] lims = { 2, 5, 2 };
		for (int i = 0; i < 3; i++) {
			int bitwise = bitwiseAnd(counts[i], lims[i]);
			System.out.println("BitwiseAND => " + bitwise + "\n");
		}
	}
}
