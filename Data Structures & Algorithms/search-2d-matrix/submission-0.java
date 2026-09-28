class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix.length * matrix[0].length;
        int n = matrix[0].length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // System.out.printf("checking: %d\n", mid);
            int current = matrix[mid / n][mid % n];
            if (current == target) {
                return true;
            } else if (current < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return false;
    }
}
