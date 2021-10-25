package com.juniors.leetcode.tree;

/**
 * 226,
 *
 * @author Juniors
 * @date 2021/10/24 19:50
 */
public class MinDepth {

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int ans = Integer.MAX_VALUE;

        if (root.left != null){
            ans = Math.min(minDepth(root.left),ans);
        }
        if (root.right != null){
            ans = Math.min(minDepth(root.right),ans);
        }
        return ans + 1;
    }
}
