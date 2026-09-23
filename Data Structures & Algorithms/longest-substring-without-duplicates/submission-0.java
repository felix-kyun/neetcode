class Solution {
    public int lengthOfLongestSubstring(String s) {
        var set = new HashSet<Character>();
        int max = 0;

        int a = 0, b = 0;
        while (b < s.length()) {
            if (set.contains(s.charAt(b))) {
                while (a < b && set.contains(s.charAt(b))) {
                    set.remove(s.charAt(a++));
                }
            }
            set.add(s.charAt(b++));
            max = Math.max(max, b - a);
        }

        return max;
    }
}
