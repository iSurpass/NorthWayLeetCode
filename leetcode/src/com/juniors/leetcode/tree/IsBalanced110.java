package com.juniors.leetcode.tree;

/**
 * @author Juniors
 * @date 2021/10/24 19:23
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class IsBalanced110 {

    public boolean isBalanced(TreeNode root) {

        return isBST(root).isBalanced;
    }

    private class ReturnNode {

        boolean isBalanced;
        int depth;

        public ReturnNode(int depth, boolean isBalanced) {
            this.depth = depth;
            this.isBalanced = isBalanced;
        }
    }

    public ReturnNode isBST(TreeNode root){

        if (root == null)
            return new ReturnNode(0,true);
        ReturnNode leftNode = isBST(root.left);
        ReturnNode rightNode = isBST(root.right);
        if (leftNode.isBalanced == false || rightNode.isBalanced == false) {
            return new ReturnNode(0,false);
        }
        if (Math.abs(leftNode.depth - rightNode.depth) > 1)
            return new ReturnNode(0,false);
        return new ReturnNode(Math.max(leftNode.depth,rightNode.depth)+1,true);
    }
}


