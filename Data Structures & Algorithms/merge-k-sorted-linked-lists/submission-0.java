class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        var pq = new PriorityQueue<ListNode>((a, b) -> Integer.compare(a.val, b.val));
        for(var list: lists) {
            if (list != null) {
                pq.add(list);
            }
        }

        var head = pq.poll();
        if (head != null) {
            if (head.next != null) {
                pq.add(head.next);
            }

            var idx = head;
            while (idx != null) {
                var tmp = pq.poll();
                if (tmp != null && tmp.next != null) {
                    pq.add(tmp.next);
                }
                idx.next = tmp;
                idx = tmp;
            }
        }

        return head;
    }
}