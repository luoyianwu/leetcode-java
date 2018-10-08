package houseRobberIII;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    public int rob(TreeNode root) {
        if (root == null) return 0;
        robDp(root);
        return root.val;
    }

    private void robDp(TreeNode node) {
        if (node.left == null && node.right == null) {
            return;
        }
        if (node.left != null) robDp(node.left);
        if (node.right != null) robDp(node.right);

        int maxProfitIfNodeIsRobbed = node.val;
        int maxProfitIfNodeIsNotRobbed = 0;
        if (node.left != null) {
            maxProfitIfNodeIsNotRobbed += node.left.val;
            if (node.left.left != null) maxProfitIfNodeIsRobbed += node.left.left.val;
            if (node.left.right != null) maxProfitIfNodeIsRobbed += node.left.right.val;
        }
        if (node.right != null) {
            maxProfitIfNodeIsNotRobbed += node.right.val;
            if (node.right.left != null) maxProfitIfNodeIsRobbed += node.right.left.val;
            if (node.right.right != null) maxProfitIfNodeIsRobbed += node.right.right.val;
        }
        node.val = Math.max(maxProfitIfNodeIsNotRobbed, maxProfitIfNodeIsRobbed);
    }
}
