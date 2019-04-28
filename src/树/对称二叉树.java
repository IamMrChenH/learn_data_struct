package 树;

import 实体类.TreeNode;

public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return is(root,root);
    }

    public boolean is(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        if (r1.val != r2.val) return false;

        return is(r1.left,r2.right)&& is(r1.right,r2.left);
    }

}
