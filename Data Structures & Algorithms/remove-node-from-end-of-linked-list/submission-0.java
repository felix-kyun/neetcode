/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head, b = head;
        for(int i = 0; i < n; i++) {
            a = a.next;
        }

        // n = sz
        if (a == null) {
            return head.next;
        }

        while (a.next != null) {
            a = a.next;
            b = b.next;
        }

        b.next = b.next.next;

        return head;
    }
}
