package 链表;

import java.util.HashMap;
import java.util.Map;

public class 复杂链表的复制 {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Integer, Node> map = new HashMap<>();
        int index = 0;
        Node ptr = head;
        Node pre = null;
        while (ptr != null) {
            map.put(index, new Node(ptr.val));
            if (pre == null) pre = ptr;
            else {
                pre.next = ptr;
                pre = ptr;
            }
            ptr = ptr.next;
            index++;
        }

        ptr = head;
        for (int i = 0; i < index; i++) {


        }

    }
}
