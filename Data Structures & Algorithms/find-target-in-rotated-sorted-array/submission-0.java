class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[end - 1] > nums[mid]) {
                if (target > nums[mid] && target <= nums[end - 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
