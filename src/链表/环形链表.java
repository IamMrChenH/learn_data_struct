package 链表;

import 实体类.ListNode;

import java.util.HashSet;
import java.util.Set;

public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> mListNodes = new HashSet<>();
        while (head != null) {
            if (mListNodes.contains(head)) return true;
            mListNodes.add(head);
            head = head.next;
        }
        return false;
    }
}
