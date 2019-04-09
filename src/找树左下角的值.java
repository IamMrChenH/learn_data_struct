import 实体类.TreeNode;

import java.util.LinkedList;

public class 找树左下角的值 {
    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            LinkedList<TreeNode> treeNodes = new LinkedList<>();
            treeNodes.add(root);
            int left = root.val;
            while (!treeNodes.isEmpty()) {
                left = treeNodes.getFirst().val;
                int size = treeNodes.size();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = treeNodes.pop();
                    if (pop.left != null)
                        treeNodes.add(pop.left);
                    if (pop.right != null)
                        treeNodes.add(pop.right);
                }
            }
            return left;
        }

    }
}
