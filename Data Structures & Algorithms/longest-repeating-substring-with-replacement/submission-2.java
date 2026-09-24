class Solution {
    public int characterReplacement(String s, int k) {
        int[] set = new int[26];

        int max = 0;
        int maxFreq = 0;
        
        for (int l = 0, r = 0; r < s.length(); r++) {
            maxFreq = Math.max(maxFreq, ++set[s.charAt(r) - 'A']);

            if ((r + 1 - l) - maxFreq > k) {
                set[s.charAt(l++) - 'A']--;
            }

            max = Math.max(max, r + 1 - l);
        }

        return max;
    }
}
