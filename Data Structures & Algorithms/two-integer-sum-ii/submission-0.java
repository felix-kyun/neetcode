class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0, b = nums.length;

        while (a < b) {
            int sum = nums[a] + nums[b - 1];
            if (sum < target) {
                a++;
            } else if (sum > target) {
                b--;
            } else {
                return new int[] {a + 1, b};
            }
        }

        return new int[] {};
    }
}
