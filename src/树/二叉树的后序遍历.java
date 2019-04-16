package 树;

import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的后序遍历 {

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        data(integers, root);
        return integers;
    }

    public void data(List<Integer> a, TreeNode r) {
        if (r == null) {
            return;
        }
        data(a, r.left);
        data(a, r.right);
        a.add(r.val);
    }
}
