package study.hacker_rank.arr;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int alicePoint = 0;
		int bobPoint = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < b.get(i))
				bobPoint++;
			else if (a.get(i) > b.get(i))
				alicePoint++;
		}
		return Arrays.asList(alicePoint, bobPoint);
	}

	public static void main(String[] args) {

		System.out.println(compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));

	}

}
