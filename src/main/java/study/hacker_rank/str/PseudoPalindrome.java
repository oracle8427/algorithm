package study.hacker_rank.str;

public class PseudoPalindrome {

    private static final int PALINDROME = 0;
    private static final int PSEUDO_PALINDROME = 1;
    private static final int NONE = 2;

    public static int palindrome(String word, int beginIndex, int endIndex) {
        while (beginIndex < endIndex) {
            if (word.charAt(beginIndex) != word.charAt(endIndex)) {
                return (isPseudoPalindrome(word, beginIndex, endIndex - 1) ||
                        isPseudoPalindrome(word, beginIndex + 1, endIndex)) ?
                        PSEUDO_PALINDROME : NONE;
            }
            beginIndex++;
            endIndex--;
        }
        return PALINDROME;
    }

    public static boolean isPseudoPalindrome(String word, int beginIndex, int endIndex) {
        while (beginIndex < endIndex) {
            if (word.charAt(beginIndex) != word.charAt(endIndex))
                return false;
            beginIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {

        for (String word : new String[]{
                "abba", "summuus", "xabba", "xabbay", "comcom", "comwwmoc", "comwwtmoc"
        }) {
            System.out.println(palindrome(word, 0, word.length() - 1));
        }


    }

}
