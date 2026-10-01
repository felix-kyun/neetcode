class Solution {
    public void reorderList(ListNode head) {
        // mid
        ListNode a = null, b = head, c = head;
        while (c != null && c.next != null) {
            a = b;
            b = b.next;
            c = c.next.next;
        }

        if (a != null) {
            a.next = null;
        }

        // reverse from mid
        ListNode current = b;
        ListNode prev = null;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }

        ListNode newList = head;
        head = head.next;
        while (head != null || prev != null) {
            if (prev != null) {
                newList.next = prev;
                newList = newList.next;
                prev = prev.next;
            }
            if (head != null) {
                newList.next = head;
                newList = newList.next;
                head = head.next;
            }
        }
    }
}
