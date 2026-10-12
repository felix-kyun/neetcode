class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length;
        int min = Integer.MAX_VALUE;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            min = Math.min(min, nums[mid]);
            // System.out.printf("%d - %d - %d\n", start, mid, end);
            if (nums[start] <= nums[end - 1] || nums[start] > nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return min;
    }
}