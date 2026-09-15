class Solution {
    int[] scores = new int[1000];
    int size = 0;

    public int calPoints(String[] ops) {
        for (String op: ops) {
            if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } else if (op.equals("C")) {
                size--;
            } else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }

        return sum;
    }
}
