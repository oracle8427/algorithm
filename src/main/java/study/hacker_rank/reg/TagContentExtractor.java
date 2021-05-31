package study.hacker_rank.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	/*-
	 * 1. <([^>]+)> : matches HTML start tags.  saved into Group #1.
	 * 
	 * 2. ([^<>]+)	: matches all the text in between the HTML start and end tags. saved into Group #2.
	 * 
	 * 3. </\\1>	: is to match the HTML end brace that corresponds to our previous start brace. 
	 * The \\1 is here to match all text from Group #1.
	 */
	private static final Pattern PATTERN = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

	public static void main(String[] args) {
		String testCases[] = { 
			"<h1>Nayeem loves counseling</h1>",
			"<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
			"<Amee>safat codes like a ninja</amee>", 
			"<SA premium>Imtiaz has a secret crush</SA premium>",
			"<h1>some</h1>",
			"<h1>had<h1>public</h1></h1>",
			"<h1>had<h1>public</h1515></h1>",
			"<h1><h1></h1></h1>",
			"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<",
			">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",
			"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>",
			"<>hello</>",
			"<>hello</><h>dim</h>",
			"<>hello</><h>dim</h>>>>>"
		};

		for (String line : testCases) {
			Matcher matcher = PATTERN.matcher(line);
			boolean matches = true;
			while (matcher.find()) {
				matches = false;
				System.out.println(matcher.group(1) + " : "+ matcher.group(2));
			}
			if (matches)
				System.out.println("None");
		}
	}

}
