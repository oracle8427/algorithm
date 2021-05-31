package study.hacker_rank.arithmetic;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			BigInteger a = sc.nextBigInteger(); // 123456789123456789
			BigInteger b = sc.nextBigInteger(); // 100000000000000000

			System.out.println(a.add(b)); // a + b
			System.out.println(a.multiply(b)); // a * b
		}
	}
}
