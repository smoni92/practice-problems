package leetcode;

import pojo.ListNode;

public class SwapNodesInListNode {

    public ListNode swapNodes(ListNode head, int k) {

        if(head == null) {
            return head;
        }

        ListNode root = head, firstNode = null, lastNode = null, tmpNode = null;
        int i = 0, j = 0;
        while(head.next != null && i < k-1) {
            head = head.next;
            i++;
        }

        firstNode = head;
        while(head.next != null) {
            head = head.next;
            i++;
        }

        head = root;
        while(head.next != null && j < (i+1-k)) {
            head = head.next;
            j++;
        }

        lastNode = head;

        tmpNode = new ListNode(lastNode.val);
        lastNode.val = firstNode.val;
        firstNode.val = tmpNode.val;

        return root;
    }
}
