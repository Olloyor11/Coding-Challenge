package leetcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = result.length() - 1;

        while (start < end) {

            if (result.charAt(start) == result.charAt(end)) {
                start++;
                end--;
            }else
                return false;

        }
        return true;

    }
}