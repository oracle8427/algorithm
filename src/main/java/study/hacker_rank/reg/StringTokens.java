package study.hacker_rank.reg;

public class StringTokens {

	public static void printTokens(String s) {
		if (s == null || s.trim().length() == 0) {
			System.out.print(0);
			return;
		}

		String[] tokens = s.trim().split("[!?,._'@\\s]+");
		System.out.println(tokens.length);
		for (String token : tokens)
			System.out.println(token);

	}

	public static void main(String[] args) {
		String[] testCase = {
			"He is a very very good boy, isn't he?",
			"Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!",
			"           YES      leading spaces        are valid,    problemsetters are         evillllll",
			"                        "
		};

		for (String s : testCase) {
			printTokens(s);
			System.out.println();
		}
	}

}
