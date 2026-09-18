class Solution {
    public static boolean isValid(char c) {
        return (c >= 'a' && c <= 'z') 
            || (c >= 'A' && c <= 'Z') 
            || (c >= '0' && c <= '9'); 
    }

    public static char toLower(char c) {
        return (char) ((c >= 'a' && c <= 'z') ? c - 32 : c);
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            while (i < j && !isValid(a)) {
                a = s.charAt(++i);
            }

            while (j > i && !isValid(b)) {
                b = s.charAt(--j);
            }

            if (toLower(a) != toLower(b)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
