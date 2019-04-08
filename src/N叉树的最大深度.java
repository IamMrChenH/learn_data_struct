import 实体类.Node;

public class N叉树的最大深度 {


    public int maxDepth(Node root) {
        if (root == null) return 0;

        System.out.println(root.val);
        int max = 0;
        for (Node n : root.children) {
            max = Math.max(max, maxDepth(n));
        }

        return max + 1;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");

    }


}
