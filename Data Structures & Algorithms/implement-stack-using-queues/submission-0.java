class MyStack {

    Deque<Integer> q = new ArrayDeque<>(); 

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offerLast(x);
        for (int i = 0; i < q.size() - 1; i++) {
            x = q.pollFirst();
            q.offerLast(x);
        }
    }
    
    public int pop() {
        return q.pollFirst();
    }
    
    public int top() {
        return q.peekFirst();    
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */