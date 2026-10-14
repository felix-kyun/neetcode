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
                currentHours += (long) Math.ceil(i / (double) mid);
            }

            System.out.printf("%d %d %d %d\n", start, mid, end, currentHours);
            if (currentHours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}