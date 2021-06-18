package study.hacker_rank.arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WidgetManufacturer {

	public static int solution(List<Integer> orderList, int widget) {
		if (orderList == null || orderList.size() == 0 || widget <= 0)
			return 0;
		Collections.sort(orderList);

		int orderCount = 0;
		for (Integer integer : orderList) {
			widget -= integer.intValue();
			if (widget < 0) {
				break;
			}
			orderCount++;
		}
		return orderCount;
	}

	public static void main(String[] args) {
		int widget = 333624;
		List<Integer> orderList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int order = random.nextInt(20000) + 10000;
			orderList.add(order);
		}
		System.out.println("Result: " + solution(orderList, widget));
	}

}
