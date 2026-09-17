class StockSpanner {

    Deque<Pair<Integer, Integer>> stack = new ArrayDeque<>();
    int day = 0;

    public StockSpanner() {

    }

    public int next(int price) {
        if (stack.size() == 0) {
            stack.push(new Pair(price, day++));
            return day;
        } else if (stack.peek().getKey() <= price) {
            while (stack.size() > 0 && stack.peek().getKey() <= price) {
                stack.pop();
            }
            return next(price);
        } else {
            var days = day - stack.peek().getValue();
            stack.push(new Pair(price, day++));
            return days;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
