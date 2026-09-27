class Solution {
    public static int diff(int x, int y) {
        return Math.abs(x - y);
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Deque<Integer> deque = new ArrayDeque<>();

        int idx = 0;
        while (idx < arr.length - 1 && diff(x, arr[idx]) > diff(x, arr[idx + 1])) {
            idx++;
        };
        deque.offerLast(arr[idx]);

        int l = idx - 1, r = idx + 1;

        while (deque.size() < k) {
            if (l >= 0 && r < arr.length) {
                if (diff(x, arr[l]) > diff(x, arr[r])) {
                    deque.offerLast(arr[r++]);
                } else {
                    deque.offerFirst(arr[l--]);
                }
            } else if (l >= 0) {
                deque.offerFirst(arr[l--]);
            } else {
                deque.offerLast(arr[r++]);
            }
            
        }

        return new ArrayList(deque);
    }
}