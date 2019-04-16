package 实体类;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode(int x) {
        val = x;
    }


    public static class Build {
        public TreeNode mTreeNode;


        public Build(int i) {
            this.mTreeNode = new TreeNode(i);
        }

        public static Build newBuild(int i) {
            return new Build(i);
        }

        public Build addLeftTree(int i) {
            mTreeNode.left = new TreeNode(i);
            return this;
        }

        public Build addRightTree(int i) {
            mTreeNode.right = new TreeNode(i);
            return this;
        }

        public TreeNode Build() {
            return mTreeNode;
        }
    }

}