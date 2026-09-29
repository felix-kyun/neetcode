class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        int start = 0, end = 46340;
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