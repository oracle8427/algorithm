package study.hacker_rank.arr;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		if (scores == null || scores.size() == 0)
			return scores;

		int highestScore = scores.get(0);
		int lowestScore = scores.get(0);
		int best = 0;
		int worst = 0;
		for (int i = 1; i < scores.size(); i++) {
			int score = scores.get(i);
			if (score > highestScore) {
				highestScore = score;
				best++;
			}

			if (score < lowestScore) {
				lowestScore = score;
				worst++;
			}
		}
		return Arrays.asList(best, worst);
	}

	public static void print(List<Integer> result) {
		for (int i : result)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		print(breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1)));
		print(breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));
	}

}
