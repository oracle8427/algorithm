package study.hacker_rank.locale;

import java.text.*;
import java.util.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		
		double payment = 12324.134;

		System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
	}
}
