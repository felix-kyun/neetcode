class Solution {
    public void invert(int[] nums, int start, int end) {
        int n = end - start;
        int tmp = 0;
        for (int i = 0; i < n / 2; i++) {
            tmp = nums[start + i];
            nums[start + i] = nums[start + n - 1 - i];
            nums[start + n - 1 - i] = tmp;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        invert(nums, 0, nums.length);
        invert(nums, 0, k);
        invert(nums, k, nums.length);
    }
}