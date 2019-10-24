package 树;

import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树所有路径 {


    public static void main(String[] args) {
        System.out.println("--------------------------");
        TreeNode q1 = new TreeNode(10);
        q1.left = new TreeNode(5);
        q1.right = new TreeNode(13);

        q1.left.left = new TreeNode( 3);

        System.out.println(binaryTreePaths(q1));


    }

    static List<String> mListStr = new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {//1 2 5

        //基本不会进来
        if (root != null) {
            binary(root, "");
        }

        return mListStr;
    }



    public static void binary(TreeNode root, String parent) {// p = 1  2  5w

        //基本不会进来
        if (root == null) {
            return;
        }

        String newParent = (parent == "" ? root.val + "" : parent + "->" + root.val);

        //结束
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            mListStr.add(newParent);
            return;
        }



        binary(root.left, newParent);
        binary(root.right, newParent);
        return;

    }


}
