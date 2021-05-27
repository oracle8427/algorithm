package study.hacker_rank;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		if (s == null || s.length() < k)
			return s;

		String smallest = s.substring(0, k);
		String largest = smallest;

		int range = s.length() - k;
		for (int i = 1; i <= range; i++) {
			String substr = s.substring(i, i + k);
			if (smallest.compareTo(substr) >= 0)
				smallest = substr;

			if (largest.compareTo(substr) < 0)
				largest = substr;
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		// Constraints 1 <= s <= 1000;
		// ["hel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava"]
		String s = "welcometojava";
		int k = 3;

		System.out.println(getSmallestAndLargest(s, k));
	}
}
