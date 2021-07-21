package leetcode.lists;

import pojo.ListNode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode head = result;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        if(l1 != null) {
            result.next = l1;
        }

        if(l2 != null) {
            result.next = l2;
        }

        return head.next;

    }

    public static void main(String[] args) {

        ListNode val3 = new ListNode(4, null);
        ListNode val4 = new ListNode(2, val3);
        ListNode l1 = new ListNode(1, val4);

        ListNode val42 = new ListNode(4, null);
        ListNode val6 = new ListNode(3, val42);
        ListNode l2 = new ListNode(1, val6);

        ListNode result = mergeTwoLists(l1, l2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
