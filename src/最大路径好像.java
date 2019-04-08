import 实体类.TreeNode;

public class 最大路径好像 {
    public static void main(String[] a) {
        System.out.println(123);
    }


    /**
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root == null) return 0;


        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }



}
