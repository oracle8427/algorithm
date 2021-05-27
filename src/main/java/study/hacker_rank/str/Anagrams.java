package study.hacker_rank.str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	private static boolean isBlank(String str) {
		return (str == null || str.trim().length() == 0);
	}

	// a.length() + b.length == O(n)
	// O(n/2) + O(n/2) = O(n)
	private static boolean isAnagram(String a, String b) {
		if (isBlank(a) || isBlank(b) || a.length() != b.length())
			return false;

		a = a.trim().toLowerCase();
		b = b.trim().toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				Integer frequency = map.get(c);
				map.put(c, frequency + 1);
			}
		}

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			Integer frequency = map.get(c);
			if (frequency == null || frequency == 0)
				return false;

			map.put(c, frequency - 1);
		}
		return true;
	}

	// a.length() + b.length == O(n)
	// 2 * (n * log(n)) + n / 2 = n * log (n)
	private static boolean isAnagram2(String a, String b) {
		if (isBlank(a) || isBlank(b) || a.length() != b.length())
			return false;

		char[] arr1 = a.trim().toLowerCase().toCharArray();
		char[] arr2 = b.trim().toLowerCase().toCharArray();

		Arrays.sort(arr1); // n * log(n)
		Arrays.sort(arr2); // n * log(n)
		// n log(n) + n log(n) = 2 * (n * log(n));

		return Arrays.equals(arr1, arr2); // n / 2
	}

	public static void main(String[] args) {
		String[] a = { "anagram", "anagramm", "Hello" };
		String[] b = { "margana", "marganaa", "hello" };
		for (int i = 0; i < 3; i++) {
			boolean ret = isAnagram(a[i], b[i]);
			System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		}
	}
}
