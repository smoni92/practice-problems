package leetcode;

import pojo.TreeNode;

public class FindTargetCopyInBinaryTree {

    TreeNode result, target;

    public void inorderTraversal(TreeNode original, TreeNode cloned) {
        if(original != null && cloned != null)     {
            inorderTraversal(original.left, cloned.left);
            if(original == target) {
                result = cloned;
            }
            inorderTraversal(original.right, cloned.right);
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inorderTraversal(original, cloned);
        return result;
    }
}
