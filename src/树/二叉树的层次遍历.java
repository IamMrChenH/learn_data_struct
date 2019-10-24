package 树;

import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 二叉树的层次遍历 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> mNodeList = new LinkedList<>();

        mNodeList.add(root);
        List<Integer> t = new ArrayList<>();
        while (!mNodeList.isEmpty()) {
            int size = mNodeList.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = mNodeList.pop();
                t.add(pop.val);
                if (pop.left != null)
                    mNodeList.add(pop.left);
                if (pop.right != null)
                    mNodeList.add(pop.right);
            }
            result.add(0,t);


        }



        return result;
    }
}
