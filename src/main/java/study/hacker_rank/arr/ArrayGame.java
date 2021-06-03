package study.hacker_rank.arr;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayGame {
	static class Game {
		int[] array;
		int jump;

		public Game(int[] array, int jump) {
			super();
			this.array = array;
			this.jump = jump;
		}
	}

	public static boolean canWin(int leap, int[] game) {
		int length = game.length;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		while (!stack.empty()) {
			int i = stack.pop();
			if (i >= length)
				return true;
			if (i < 0 || game[i] == 1)
				continue;
			game[i] = 1;
			stack.push(i + 1);
			stack.push(i - 1);
			stack.push(i + leap);
		}
		return false;
	}

	/*-
	YES
	YES
	NO
	NO
	YES
	NO
	YES */
	public static void main(String[] args) {
		List<Game> list = new ArrayList<>();
		list.add(new Game(new int[] { 0, 0, 0, 0, 0 }, 3));
		list.add(new Game(new int[] { 0, 0, 0, 1, 1, 1 }, 5));
		list.add(new Game(new int[] { 0, 0, 1, 1, 1, 0 }, 3));
		list.add(new Game(new int[] { 0, 1, 0 }, 1));
		list.add(new Game(new int[] { 0, 1, 0, 1, 0, 1 }, 2));
		list.add(new Game(new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, 6));
		list.add(new Game(new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, 3));
		list.add(new Game(new int[] { 0, 1, 1, 0, 0, 1, 1, 0, 1 }, 4));
		for (Game game : list) {

			System.out.println((canWin(game.jump, game.array)) ? "YES" : "NO");
		}

	}
}
