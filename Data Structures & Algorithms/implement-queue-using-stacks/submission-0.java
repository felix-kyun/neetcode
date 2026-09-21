class MyQueue {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> aux = new ArrayDeque<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.offerLast(x);
    }
    
    public int pop() {
        peek();

        return aux.pollLast();
    }
    
    public int peek() {
        if (aux.size() == 0) {
            while (stack.size() != 0) {
                aux.offerLast(stack.pollLast());
            }
        }

        return aux.peekLast();
    }
    
    public boolean empty() {
        return stack.isEmpty() && aux.isEmpty();
    }
}
