class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[5000];
        int size = 0;

        for (String token : tokens) {
            switch (token.charAt(token.length() - 1)) {
                case '+':
                    stack[size - 2] = stack[size - 2] + stack[size - 1];
                    size--;
                    break;
                case '-':
                    stack[size - 2] = stack[size - 2] - stack[size - 1];
                    size--;
                    break;
                case '*':
                    stack[size - 2] = stack[size - 2] * stack[size - 1];
                    size--;
                    break;
                case '/':
                    stack[size - 2] = stack[size - 2] / stack[size - 1];
                    size--;
                    break;
                default:
                    stack[size++] = Integer.parseInt(token);
                    break;
            }
        }

        return stack[0];
    }
}
