import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 二叉树的中序遍历 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> mList = new ArrayList<>();
        bianli(root, mList);
        return mList;
    }

    public static void bianli(TreeNode root, List<Integer> data) {
        if (root == null) return;
        bianli(root.left, data);
        data.add(root.val);
        bianli(root.right, data);

    }

    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> mList = new ArrayList<>();
        LinkedList<TreeNode> node = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !node.isEmpty()) {

            if (cur != null) {
                node.push(cur);
                cur = cur.left;
            } else {
                cur = node.pop();
                mList.add(cur.val);
                cur = cur.right;
            }

        }


        return mList;
    }


    public static void main(String[] a) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(20);
        //  System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal2(root));
    }
}
