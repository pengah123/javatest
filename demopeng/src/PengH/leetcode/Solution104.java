package PengH.leetcode;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。
*/
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
    //迭代法
    class Solution {
        public int maxDepth(TreeNode root) {
            Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
            if (root != null) {
                stack.add(new Pair(root, 1));
            }

            int depth = 0;
            while (!stack.isEmpty()) {
                Pair<TreeNode, Integer> current = stack.poll();
                root = current.getKey();
                int current_depth = current.getValue();
                if (root != null) {
                    depth = Math.max(depth, current_depth);
                    stack.add(new Pair(root.left, current_depth + 1));
                    stack.add(new Pair(root.right, current_depth + 1));
                }
            }
            return depth;
        }
    }
}
