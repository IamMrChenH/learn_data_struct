package 树;

import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageOfLevels = new ArrayList<>();
        if (root == null) {
            return averageOfLevels;
        }
        LinkedList<TreeNode> mTreeNodes = new LinkedList<>();
        mTreeNodes.add(root);
        while (!mTreeNodes.isEmpty()) {
            double avg = 0;
            int size = mTreeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = mTreeNodes.pop();
                avg += pop.val;
                if (pop.left != null)
                    mTreeNodes.add(pop.left);
                if (pop.right != null)
                    mTreeNodes.add(pop.right);
            }
            averageOfLevels.add(avg / size);
        }


        return averageOfLevels;
    }
}
