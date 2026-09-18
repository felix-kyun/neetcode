class MinStack {
    ArrayList<Integer> items = new ArrayList<>();
    // pair<value, items.size() when inserted>
    ArrayList<Pair<Integer, Integer>> minList = new ArrayList<>();

    public MinStack() { }
    
    public void push(int val) {
        items.add(val);
        if (minList.size() == 0 || val < minList.get(minList.size() - 1).getKey()) {
            minList.add(new Pair(val, items.size()));
        }
    }
    
    public void pop() {
        if (items.size() == minList.get(minList.size() - 1).getValue()) {
            minList.remove(minList.size() - 1);
        }
        items.remove(items.size() - 1);
    }
    
    public int top() {
        return items.get(items.size() - 1);
    }
    
    public int getMin() {
        return minList.get(minList.size() - 1).getKey();
    }
}

