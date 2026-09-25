class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int current = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            current += nums[r];

            if (current >= target) {
                while (current - nums[l] >= target) {
                    current -= nums[l++];
                }
                min = Math.min(min, r + 1 - l);
                current -= nums[l++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}