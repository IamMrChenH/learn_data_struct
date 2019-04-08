import 实体类.TreeNode;

public class 排队出队 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a[] = {1, 2,3,4,5,6,7,8,9,10};
        TreeNode head = new TreeNode(a[0]);
        TreeNode node = head;

        for (int i = 1; i < a.length; i++) {
            node.next = new TreeNode(a[i]);
            node = node.next;
        }
        node.next = head;


        print(delete(head, 0));
    }

    private static void print(TreeNode head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        if (head.val == head.next.val) return;
        print(head.next);
    }

    public static TreeNode delete(TreeNode node, int count) {
        if (node.val == node.next.val) {
            return node;
        }
        count = count + 1;

        if (count % 2 == 0) {
            count = 0;
            node.next = node.next.next;

        }
        return delete(node.next, count);
    }


}
