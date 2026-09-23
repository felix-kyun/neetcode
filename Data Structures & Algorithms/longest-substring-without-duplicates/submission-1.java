class Solution {
    public int lengthOfLongestSubstring(String s) {
        var set = new int[1 << 7];
        int max = 0;

        int a = 0, b = 0;
        while (b < s.length()) {
            char ch = s.charAt(b);
            if (set[ch] > 0) {
                while (a < b && set[ch] > 0) {
                    set[s.charAt(a++)]--;
                }
            }
            set[s.charAt(b++)]++;
            max = Math.max(max, b - a);
        }

        return max;
    }
}
