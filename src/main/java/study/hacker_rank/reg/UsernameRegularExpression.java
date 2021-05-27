package study.hacker_rank.reg;

public class UsernameRegularExpression {

	public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
	

	public static void main(String[] args) {
		String[] testCase = { 
			"Julia",
			"Samantha",
			"Samantha_21",
			"1Samantha",
			"Samantha?10_2A",
			"JuliaZ007",
			"Julia@007",
			"_Julia007"
		};

		for (String userName : testCase) {
			if (userName.matches(regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}

}
