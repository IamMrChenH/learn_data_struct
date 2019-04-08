import 实体类.TreeNode;

public class 验证二叉搜索树 {
    public static void main(String[] args) {
        System.out.println("Hello World!");


    }

    public boolean isValidBST(TreeNode root) {


        return root == null ? true : f1(root.left, root.val) && f2(root.right, root.val) &&
                isValidBST(root.left) && isValidBST(root.right);
    }


    public boolean f1(TreeNode root, int a) {
        boolean isF = true;
        if (root == null) return true;

        if (root.val >= a)
            return false;


        isF = isF & f1(root.left, a);
        isF = isF & f1(root.right, a);


        return isF;
    }


    public boolean f2(TreeNode root, int a) {
        boolean isF = true;
        if (root == null) return true;

        if (root.val <= a)
            isF = false;


        isF = isF & f2(root.left, a);
        isF = isF & f2(root.right, a);


        return isF;
    }
}
