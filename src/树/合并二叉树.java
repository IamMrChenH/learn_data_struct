package 树;

import 实体类.TreeNode;

public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;

        TreeNode node = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));

        node.left = mergeTrees((t1 == null ? null : t1.left), (t2 == null ? null : t2.left));
        node.right = mergeTrees((t1 == null ? null : t1.right), (t2 == null ? null : t2.right));

        return node;
    }


    public static void main(String[] a) {
        int av = 1;
        int b = av;
        b = 2;

        System.out.println(av);
    }

}
