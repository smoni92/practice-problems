package leetcodeproblems;

import pojo.ListNode;

public class AddTwoNumbersListNode {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode head = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int val = num1 + num2 + carry;

            result.next = new ListNode(val % 10);
            carry = val / 10;

            result = result.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args) {

        ListNode val3 = new ListNode(3, null);
        ListNode val4 = new ListNode(4, val3);
        ListNode l1 = new ListNode(2, val4);

        ListNode val42 = new ListNode(4, null);
        ListNode val6 = new ListNode(6, val42);
        ListNode l2 = new ListNode(5, val6);

        ListNode result = addTwoNumbers(l1, l2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

}
