class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length;
        int min = Integer.MAX_VALUE;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return min;
    }
}