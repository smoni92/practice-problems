package leetcode.listnode;

import pojo.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoListNodes {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> nodesInB = new HashSet<ListNode>();

        while(headB != null) {
            nodesInB.add(headB);
            headB = headB.next;
        }

        while(headA != null) {
            if(nodesInB.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}
