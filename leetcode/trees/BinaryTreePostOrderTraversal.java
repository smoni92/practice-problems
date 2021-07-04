package leetcode.trees;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {


    final List<Integer> postOrderListImproved = new ArrayList<>();

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        if (root == null) {
            return postOrderList;
        }

        postOrderList.addAll(postOrderTraversal(root.left));
        postOrderList.addAll(postOrderTraversal(root.right));
        postOrderList.add(root.val);

        return postOrderList;
    }

    public List<Integer> postOrderTraversalImproved(TreeNode root) {
        if (root == null) {
            return postOrderListImproved;
        }

        postOrderTraversalImproved(root.left);
        postOrderTraversalImproved(root.right);
        postOrderListImproved.add(root.val);

        return postOrderListImproved;
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);

        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;

        BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
        System.out.println(binaryTreePostOrderTraversal.postOrderTraversal(treeNode1));
        System.out.println(binaryTreePostOrderTraversal.postOrderTraversalImproved(treeNode1));
    }
}
