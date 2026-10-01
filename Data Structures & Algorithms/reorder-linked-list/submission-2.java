class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse from mid
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 != null) {
            ListNode tmp = p1.next;
            p1.next = p2;
            ListNode tmp2 = p2.next;
            p2.next = tmp;
            p1 = tmp;
            p2 = tmp2;
        }
    }
}
