package leetcodeproblems;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightNodes = new ArrayList<Integer>();
        if(root == null)  {
            return rightNodes;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();
                if(i == size-1)  {
                    rightNodes.add(currentNode.val);
                }

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return rightNodes;
    }

    public static void main(String[] args) {

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(rightSideView(node1));
    }
}
