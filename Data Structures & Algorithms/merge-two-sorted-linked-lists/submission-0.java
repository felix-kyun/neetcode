class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head = null, current = null;
        
        if (a != null && b != null) {
            if (a.val <= b.val) {
                head = a;
                a = a.next;
            } else {
                head = b;
                b = b.next;
            }

            current = head;
        } else if (a != null) {
            return a;
        } else if (b != null) {
            return b;
        } else {
            return null;
        }

        while (a != null && b != null) {
            if (a.val <= b.val) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        if (a != null) {
            current.next = a;
        }

        if (b != null) {
            current.next = b;
        }

        return head;
    }
}