package leetcode.trees;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    final List<Integer> preOrderListImproved = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        if (root == null) {
            return preOrderList;
        }
        preOrderList.add(root.val);
        preOrderList.addAll(preorderTraversal(root.left));
        preOrderList.addAll(preorderTraversal(root.right));

        return preOrderList;
    }

    public List<Integer> preorderTraversalImproved(TreeNode root) {
        if (root == null) {
            return preOrderListImproved;
        }
        preOrderListImproved.add(root.val);
        preorderTraversalImproved(root.left);
        preorderTraversalImproved(root.right);

        return preOrderListImproved;
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;

        BinaryTreePreOrderTraversal binaryTreePreOrderTraversal = new BinaryTreePreOrderTraversal();
        System.out.println(binaryTreePreOrderTraversal.preorderTraversal(treeNode1));
        System.out.println(binaryTreePreOrderTraversal.preorderTraversalImproved(treeNode1));
    }
}
