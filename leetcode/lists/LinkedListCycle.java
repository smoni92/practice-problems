package leetcode.lists;

import pojo.ListNode;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode slowPtr = head, fastPtr = head;
        while(slowPtr.next != null && fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode(2, null);
        ListNode l1 = new ListNode(1, l2);

        System.out.println(hasCycle(l1));

        ListNode l31 = new ListNode(3);
        ListNode l21 = new ListNode(2, l31);
        ListNode l11 = new ListNode(1, l21);
        l31.next = l11;

        System.out.println(hasCycle(l11));
    }
}
