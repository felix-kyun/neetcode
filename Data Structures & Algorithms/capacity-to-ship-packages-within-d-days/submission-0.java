class Solution {

    public int calculate(int[] weights, int cap) {
        int days = 0;
        int current = 0;
        for (int weight : weights) {
            current += weight;
            if (current >= cap) {
                // System.out.printf("resetting at %d\n", current);
                days++;
                current = current == cap ? 0 : weight;
            }
        }

        if (current > 0) {
            days++;
        }

        return days;
    }

    int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxValue = Arrays.stream(weights).max().getAsInt();
        int start = maxValue, mid = 0, end = maxValue * weights.length;

        while (start < end) {
            mid = start + (end - start) / 2;
            // System.out.printf("%d %d %d\n", start, mid, end);
            if (calculate(weights, mid) <= days) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}