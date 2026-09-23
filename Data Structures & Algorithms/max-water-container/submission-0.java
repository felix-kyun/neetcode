class Solution {
    public int maxArea(int[] heights) {
        int a = 0, b = heights.length;
        int area = 0;
        while (a < b) {
            area = Math.max(area, Math.min(heights[a], heights[b - 1]) * (b - 1 - a));
            // System.out.printf("%d-%d => %d\n", a, b, area);
            if (heights[a] < heights[b - 1]) {
                a++;
            } else {
                b--;
            }
        }

        return area;
    }
}
