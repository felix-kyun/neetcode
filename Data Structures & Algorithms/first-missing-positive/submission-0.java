class Solution {
    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public int firstMissingPositive(int[] nums) {
        
        for (int i = 0; i < nums.length;) {
            if (nums[i] < 1 || nums[i] > nums.length || nums[nums[i] - 1] == nums[i]) {
                i++;
            } else {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}