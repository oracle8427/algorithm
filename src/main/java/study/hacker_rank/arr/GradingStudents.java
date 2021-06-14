package study.hacker_rank.arr;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		for (int i = 0; i < grades.size(); i++) {
			int grade = grades.get(i);

			int pivot = grade % 5;
			if (pivot >= 3) {
				int upgrade = grade + (5 - pivot);
				if (upgrade < 40)
					continue;
				grades.set(i, upgrade);
			}

		}
		return grades;
	}

	public static void main(String[] args) {
		System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
	}

}
