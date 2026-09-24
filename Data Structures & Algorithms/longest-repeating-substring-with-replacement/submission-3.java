class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            maxFreq = Math.max(maxFreq, ++freq[s.charAt(r) - 'A']);

            if ((r + 1 - l) - maxFreq > k) {
                freq[s.charAt(l++) - 'A']--;
            }
        }

        return s.length() - l;
    }
}
