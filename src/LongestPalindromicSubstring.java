
/*
Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (currentLogestPalindrome(s, i).length() > result.length()) {
                result = currentLogestPalindrome(s, i);
            }
        }


        return result;
    }

    private String currentLogestPalindrome(String s, int i) {
        String temp = "";

        if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
            int length = Math.min(i, s.length() - i - 2);

            for (int j = 0; j <= length; j++) {

                if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                    temp = s.substring(i - j, i + j + 2);
                } else {
                    break;
                }

            }
        }

        int length = Math.min(i, s.length() - i - 1);
        String temp1 = "";
        for (int j = 0; j <= length; j++) {

            if (s.charAt(i - j) == s.charAt(i + j)) {
                temp1 = s.substring(i - j, i + j + 1);
            } else {
                break;
            }

        }


        return temp.length() > temp1.length() ? temp : temp1;
    }
}
