package houseRobberIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob() {
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(0);
        root.right = new TreeNode(50);
        root.left.left = new TreeNode(100);
        root.left.left.left = new TreeNode(25);
        root.left.left.right = new TreeNode(50);

        Solution s = new Solution();
        assertEquals(200, s.rob(root));
    }
}