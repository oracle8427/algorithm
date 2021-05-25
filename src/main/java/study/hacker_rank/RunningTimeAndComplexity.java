package study.hacker_rank;

public class RunningTimeAndComplexity {

	// O(root of number)
	public static boolean isPrime(int number) {
		if (number == 1)
			return false;
		Double d = Math.sqrt(number);
		int sqrt = d.intValue();
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array = { 12, 5, 7 };
		// int[] array = { 1000000007, 100000003, 1000003 };
		int size = array.length;

		for (int i = 0; i < size; i++) {
			int number = array[i];
			if (isPrime(number))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}

	}
}
