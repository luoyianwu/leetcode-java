package completeBinaryTreeInserter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CBTInserterTest {

    @Test
    void canBeCreated() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        CBTInserter obj = new CBTInserter(root);
        assertEquals(root, obj.get_root());
    }

    @Test
    void insert() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        CBTInserter obj = new CBTInserter(root);
        assertEquals(3, obj.insert(7));
        assertEquals(4, obj.insert(8));
        assertEquals(7, obj.get_root().right.right.val);
        assertEquals(8, obj.get_root().left.left.left.val);

        obj = new CBTInserter(new TreeNode(1));
        assertEquals(1, obj.insert(2));
        assertEquals(2, obj.get_root().left.val);
    }
}