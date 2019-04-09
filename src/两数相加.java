import 实体类.ListNode;

import java.util.ArrayList;

public class 两数相加 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode q = l1, p = l2, head = new ListNode(0), curr;
        curr = head;

        int cousr = 0;
        while (q != null || p != null) {
            int x = (q != null) ? q.val : 0;
            int y = (p != null) ? p.val : 0;

            int sum = x + y + cousr;
            cousr = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (q != null) q = q.next;
            if (p != null) p = p.next;
        }
        if (cousr > 0)
            curr.next = new ListNode(cousr);
        return head.next;
    }

    public static void main(String[] a) {


    }

    public static void print(ListNode a) {
        if (a == null) return;
        System.out.println(a.val + "->");
        print(a.next);


    }

}
