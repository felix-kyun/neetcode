class Solution {
    public int[] dailyTemperatures(int[] t) {
        var s = new int[t.length];
        var size = 0;
        var out = new int[t.length];

        for (int i = t.length - 1; i >= 0;) {
            int temp = t[i];

            if (size == 0) {
                out[i] = 0;
                s[size++] = i;
                i--;
            } else if (temp >= t[s[size - 1]]) {
                while (size > 0 && temp >= t[s[size - 1]]) {
                    size--;
                }
                continue;
            } else {
                out[i] = s[size - 1] - i;
                s[size++] = i;
                i--;
            }
        }

        return out;
    }
}
