class Solution {

    private static int findClosing(String s, int start) {
        // start should be a '['
        int count = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                count++;
            } else if (s.charAt(i) == ']') {
                count--;
                if (count == 0) {
                    return i;
                }
            }
        }

        return -1;
    }

    public String decodeString(String s) {
        return decodeString(s, 0, s.length());
    }

    private String decodeString(String s, int start, int end) {
        var sb = new StringBuffer();
        // System.out.printf("decodeString(s, %d, %d)\n", start, end);

        for (int i = start; i < end; i++) {
            var current = s.charAt(i);

            if (isDigit(current)) {
                var subStart = i;
                while (s.charAt(subStart) != '[') {
                    subStart++;
                }
                var n = Integer.parseInt(s.substring(i, subStart));
                var subEnd = findClosing(s, subStart);
                var str = decodeString(s, subStart + 1, subEnd);
                for (int j = 0; j < n; j++) {
                    sb.append(str);
                }
                i = subEnd;
            } else {
                var subStart = i;
                while (subStart < end && !isDigit(s.charAt(subStart))) {
                    subStart++;
                }
                sb.append(s.substring(i, subStart));
                i = subStart - 1;
            }
        }

        return sb.toString();
    }

    private static boolean isDigit(char c) {
        var diff = c - '0';
        return (diff >= 0 && diff < 10);
    }
}
