class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x = 0, y = 0;
        int xf = 0, yf = 0;

        for (int i: nums) {
            if (i == x) {
                xf++;
            } else if (i == y) {
                yf++;
            } else if (xf == 0) {
                x = i;
                xf = 1;
            } else if (yf == 0) {
                y = i;
                yf = 1;
            } else {
                xf--;
                yf--;
            }
        }
        List<Integer> list = new ArrayList<>();
        xf = 0;
        yf = 0;
        for (int i: nums) {
            if (i == x) xf++;
            if (i == y) yf++;
        }
        if (xf > nums.length / 3) {
            list.add(x);
        }
        if (yf > nums.length / 3) {
            list.add(y);
        }
        return list;
    }
}