/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node nHead = null;
        Node nPtr = null;
        Node ptr = head;
        while (ptr != null) {
            if (nPtr == null) {
                nPtr = new Node(ptr.val);
                nHead = nPtr;
            } else {
                nPtr.next = new Node(ptr.val);
                nPtr = nPtr.next;
            }
            map.put(ptr, nPtr);
            ptr = ptr.next;
        }

        ptr = head;
        nPtr = nHead;
        while (ptr != null) {
            nPtr.random = map.get(ptr.random);

            nPtr = nPtr.next;
            ptr = ptr.next;
        }

        return nHead;
    }
}
