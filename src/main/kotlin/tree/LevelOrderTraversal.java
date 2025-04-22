package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            var queueSize = queue.size();
            List<Integer> tempArray = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                var mainTreeNode = queue.poll();
                if (mainTreeNode.left != null) {
                    queue.offer(mainTreeNode.left);
                }
                if (mainTreeNode.right != null) {
                    queue.offer(mainTreeNode.right);
                }
                tempArray.add(mainTreeNode.val);
            }

            result.add(tempArray);
        }

        return result;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}