package study.hacker_rank.arithmetic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class _BigDecimal {

	public static void main(String[] args) {
		String[] testCases = {
			"-100",
			"50",
			"0",
			"56.6",
			"90",
			"0.12",
			".12",
			"02.34",
			"000.000"
		};

		Arrays.sort(testCases, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return new BigDecimal(o2).compareTo(new BigDecimal(o1));
			}
		});
		for (String string : testCases) {
			System.out.println(string);
		}
	}

}
