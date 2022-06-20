package 链表;

import java.util.List;

public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = head;
        ListNode ptr = head.next;
        pre.next = null;

        while (ptr != null) {

            ListNode next = ptr.next;
            ptr.next = pre;

            pre = ptr;
            ptr = next;
        }
        return pre;
    }
}
