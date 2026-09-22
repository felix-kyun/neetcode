class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int idx = 1;
        while (idx < nums.length) {
            if (nums[idx] != nums[k - 1]) {
                nums[k++] = nums[idx];
            }

            idx++;
        } 
    
        return k;
    }
}