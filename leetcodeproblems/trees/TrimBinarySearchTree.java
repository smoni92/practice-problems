package leetcodeproblems.trees;

import leetcodeproblems.pojo.TreeNode;

public class TrimBinarySearchTree {

    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        if (root.val < low) {
            return root.right;
        }

        if (root.val > high) {
            return root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;
        int low = 1, high = 2;

        System.out.println(treeNode1);

        System.out.println("After Trimming the BST...");

        System.out.println(trimBST(treeNode1, low, high));
    }
}
