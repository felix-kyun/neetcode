class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length(), true);
    }

    public boolean validPalindrome(String s, int start, int end, boolean save) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end - 1)) {
                if (save) {
                    return validPalindrome(s, start, end - 1, false) || validPalindrome(s, start + 1, end, false);
                } else {
                    return false;
                }
            }
            start++;
            end--;
        }

        return true;
    }
}