class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));

        for (int i = 2; i <= numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for (int j = 1; j < i - 1; j++) {
                List<Integer> prev = list.get(i - 2);
                current.add(prev.get(j - 1) + prev.get(j));
            }

            current.add(1);
            list.add(current);
        }

        return list;
    }
}