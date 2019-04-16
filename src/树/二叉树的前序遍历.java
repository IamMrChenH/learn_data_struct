package 树;

import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历 {


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        data(integers, root);
        return integers;
    }

    public static void data(List<Integer> integers, TreeNode root) {
        if (root == null) {
            return;
        }
        integers.add(root.val);
        data(integers,root.left);
        data(integers,root.right);
    }


    public static void main(String[] args) {
        TreeNode build = TreeNode.Build.newBuild(1).addLeftTree(4).addRightTree(3).Build();
        build.left.left = new TreeNode(2);
        preorderTraversal(build);

    }
}
