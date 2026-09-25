class Solution {
    public boolean checkInclusion(String s1, String s2) {
        var f = new int[26];
        var distinct = 0;
        for (char ch : s1.toCharArray()) {
            if (--f[ch - 'a'] == -1) {
                distinct++;
            }
        }

        for (int l = 0, r = 0; r < s2.length(); r++) {
            int freq = ++f[s2.charAt(r) - 'a'];
            if (freq == 1) {
                distinct++;
            } else if (freq == 0) {
                distinct--;
            }

            if (r + 1 - l > s1.length()) {
                int currentFreq = --f[s2.charAt(l++) - 'a'];
                if (currentFreq == 0) {
                    distinct--;
                } else if (currentFreq == -1) {
                    distinct++;
                }
            }

            if (distinct == 0) {
                return true;
            }
        }

        return false;
    }
}