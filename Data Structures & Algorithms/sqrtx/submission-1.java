class Solution {
    public int mySqrt(int x) {
        int start = 0, end = x / 2;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int current = mid * mid;
            int next = (mid + 1) * (mid + 1);
            if (current <= x && next > x) {
                return mid;
            } else if (current > x) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}