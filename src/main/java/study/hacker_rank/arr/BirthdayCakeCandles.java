package study.hacker_rank.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

	public static int birthdayCakeCandles(List<Integer> candles) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer integer : candles) {
			Integer value = map.get(integer);
			if (value == null) {
				map.put(integer, 1);
			} else {
				map.put(integer, value.intValue() + 1);
			}
		}

		return Collections.max(map.values());
	}

	public static void main(String[] args) {
		System.out.println(Arrays.asList(3, 2, 1, 3));
		System.out.println(Arrays.asList(4, 4, 1, 3));
	}
}
