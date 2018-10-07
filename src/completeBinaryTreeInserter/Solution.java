package completeBinaryTreeInserter;


import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class CBTInserter {

    private TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
    }

    public int insert(int v) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            if (node.left == null) {
                node.left = new TreeNode(v);
                return node.val;
            }
            if (node.right == null) {
                node.right = new TreeNode(v);
                return node.val;
            }
            q.add(node.left);
            q.add(node.right);
        }
        return -1;
    }

    public TreeNode get_root() {
        return this.root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
