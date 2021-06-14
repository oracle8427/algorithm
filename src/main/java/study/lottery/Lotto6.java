package study.lottery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto6 {

	private static final Random RANDOM = new Random();
	private static Set<Integer> GLOBAL_SET = new HashSet<>();

	public static String createNumbers() {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			int number = RANDOM.nextInt(45) + 1;
			if (GLOBAL_SET.contains(number))
				continue;

			set.add(number);
		}
		return set.toString();
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "회: " + createNumbers());
		}

	}

}
