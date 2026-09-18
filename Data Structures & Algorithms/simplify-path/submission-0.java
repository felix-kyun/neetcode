class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();

        for (String name: path.split("/")) {
            if (name.length() == 0) {
                continue;
            } else if (name.charAt(0) == '.') {
                if (name.equals(".")) {
                    continue;
                } else if (name.equals("..")) {
                    if (stack.size() > 0) {
                        stack.pop();
                    }
                } else {
                    stack.push(name);
                }
            } else {
                stack.push(name);
            }
        }

        for (String name: stack.reversed()) {
            sb.append("/");
            sb.append(name);
        }

        if (sb.length() == 0) {
            sb.append("/");
        }

        return sb.toString();
    }
}
