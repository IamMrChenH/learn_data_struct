package 树;

import 实体类.TreeNode;

import java.util.Stack;

/**
 * @author CHENH
 * @version 1.0
 * @date 2020/02/01
 */
public class 二叉搜索树迭代器_173 {

    class BSTIterator {
        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            addLeftNode(root);
        }

        public void addLeftNode(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode pop = stack.pop();
            if (pop.right != null) {
                this.addLeftNode(pop.right);
            }
            return pop.val;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return stack.size() > 0;
        }
    }

}
