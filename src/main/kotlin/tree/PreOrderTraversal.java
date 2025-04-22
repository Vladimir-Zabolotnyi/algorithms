package tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return find(root, result);
    }

    private List<Integer> find(TreeNode root, List<Integer> result) {
        try {
            result.add(root.val);
        } catch (NullPointerException ignored) {
            return result;
        }
        if (root.left != null) {
            find(root.left, result);
        }
        if (root.right != null) {
            find(root.right, result);
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