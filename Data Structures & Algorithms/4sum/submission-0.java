class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                int c = b + 1;
                int d = n - 1;

                while (c < d) {
                    long sum = (long)nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum < target) {
                        c++;
                    } else if (sum > target) {
                        d--;
                    } else {
                        list.add(List.of(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        while (c < d && nums[c] == nums[c - 1]) c++;
                        d--;
                        while (d > c && nums[d] == nums[d + 1]) d--;
                    }
                }
            }
        }

        return list;
    }
}