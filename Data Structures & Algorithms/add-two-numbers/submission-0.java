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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode p1 = l1, p2 = l2;
        ListNode head = null;
        ListNode ptr = null;

        while (p1 != null || p2 != null) {
            if (ptr == null) {
                ptr = new ListNode();
                head = ptr;
            }

            int sum = carry;
            sum += (p1 != null) ? p1.val : 0;
            sum += (p2 != null) ? p2.val : 0;

            ptr.next = new ListNode(sum);

            ptr = ptr.next;
            p1 = p1 != null ? p1.next : null;
            p2 = p2 != null ? p2.next : null;
        
            carry = ptr.val > 9 ? ptr.val / 10 : 0;
            ptr.val -= 10 * carry;
        }

        if (carry != 0) {
            ptr.next = new ListNode(carry);
        }

        return (head != null) ? head.next : null;
    }
}
