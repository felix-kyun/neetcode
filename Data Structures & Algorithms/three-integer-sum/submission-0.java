class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] + nums[i+1] + nums[i+2] > 0) {
                return list;
            }

            int a = i + 1;
            int b = nums.length - 1;

            while (a < b) {
                int sum = nums[a] + nums[b] + nums[i];
                if (sum < 0) {
                    a++;
                } else if (sum > 0) {
                    b--;
                } else {
                    list.add(List.of(nums[a], nums[b], nums[i]));
                    // System.out.printf("a=%d, b=%d, i=%d\n", a, b, i);
                    a++;
                    while (a < b && nums[a] == nums[a - 1])
                        a++;
                    b--;
                    while (b > a && nums[b] == nums[b + 1])
                        b--;
                }

            }
        }

        return list;
    }
}