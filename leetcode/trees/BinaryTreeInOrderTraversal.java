package leetcode.trees;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {

    final List<Integer> inOrderListImproved = new ArrayList<>();

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        if (root == null) {
            return inOrderList;
        }

        inOrderList.addAll(inOrderTraversal(root.left));
        inOrderList.add(root.val);
        inOrderList.addAll(inOrderTraversal(root.right));

        return inOrderList;
    }

    public List<Integer> inOrderTraversalImproved(TreeNode root) {
        if (root == null) {
            return inOrderListImproved;
        }

        inOrderTraversalImproved(root.left);
        inOrderListImproved.add(root.val);
        inOrderTraversalImproved(root.right);

        return inOrderListImproved;
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;

        BinaryTreeInOrderTraversal binaryTreeInOrderTraversal = new BinaryTreeInOrderTraversal();
        System.out.println(binaryTreeInOrderTraversal.inOrderTraversal(treeNode1));
        System.out.println(binaryTreeInOrderTraversal.inOrderTraversalImproved(treeNode1));
    }
}
