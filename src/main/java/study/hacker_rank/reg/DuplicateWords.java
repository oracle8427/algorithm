package study.hacker_rank.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

	/*-
	 * \\w  a word character: [a-zA-Z_0-9]
	 * \\W  a none word character
	 * \\b	a word boundary
	 * \\1	Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
	 * +	Match whatever it's placed after 1 or more times
	 * */
	private static final String REGEX = "\\b(\\w+)(?:\\W+\\1\\b)+";
	private static final Pattern PATTERN = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

	public static void main(String[] args) {

		String[] testCase = { 
			"Goodbye bye bye world world world",
			"Sam went went to to to his business",
			"Reya is is the the best player in eye eye game",
			"in inthe", "Hello hello Ab aB"
		};

		for (String s : testCase) {
			Matcher matcher = PATTERN.matcher(s);
			while (matcher.find()) {
				s = s.replaceAll(matcher.group(), matcher.group(1));
			}
			System.out.println(s);
		}

	}

}
