class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    // top
                    perimeter += (i > 0 && grid[i - 1][j] == 1) ? 0 : 1;
                    // bottom
                    perimeter += (i < grid.length - 1 && grid[i + 1][j] == 1) ? 0 : 1;
                    // left
                    perimeter += (j > 0 && grid[i][j - 1] == 1) ? 0 : 1;
                    // right
                    perimeter += (j < grid[i].length - 1 && grid[i][j + 1] == 1) ? 0 : 1;
                }
            }
        }

        return perimeter;
    }
}