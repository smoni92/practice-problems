package leetcode.listnode;

import pojo.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode currNode = head;
        while(currNode != null && currNode.next != null) {
            if(currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            }  else {
                currNode = currNode.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode val3 = new ListNode(4, null);
        ListNode val4 = new ListNode(1, val3);
        ListNode l1 = new ListNode(1, val4);

        ListNode result = deleteDuplicates(l1);

        while(result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("NULL");

    }
}
