package 树;

import 实体类.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

class 二叉搜索树的范围和 {

    public static void main(String[] args) {
        TreeNode.Build root = TreeNode.Build.newBuild(10);
        TreeNode.Build rootLeft = root.addLeftTree(5);
        rootLeft.addLeftTree(3);
        rootLeft.addRightTree(7);
        TreeNode.Build rootRight = root.addRightTree(15);
        rootRight.addLeftTree(14);
        rootRight.addRightTree(18);
        System.out.println(rangeSumBST(root.Build(), 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}