class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();

        for (int i: nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }
}