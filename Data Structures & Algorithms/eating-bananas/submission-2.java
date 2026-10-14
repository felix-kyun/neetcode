class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i: piles) {
            max = Math.max(max, i);
        }

        int start = 1, mid = 0, end = max;
        long currentHours = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            // check
            currentHours = 0;
            for (int i: piles) {
                currentHours += (i + mid - 1) / mid;
            }

            if (currentHours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}