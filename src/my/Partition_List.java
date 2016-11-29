package my;

import my.util.ListNode;

/**
 * Created by dean on 16/11/23.
 */
public class Partition_List {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode p = head,q = head.next;
        if (head.val >= x){
            while (q != null){
                if (q.val < x){
                    p.next = q.next;
                    q.next = head;
                    head = q;
                    break;
                }
                p = q;
                q = q.next;
            }
        }
        p = head;
        q = head.next;
        ListNode s = head;
        while (q != null){
            if (q.val < x){
                p.next = q.next;
                q.next = s.next;
                s.next = q;
                s = q;
            }
            p = q;
            q = q.next;
        }
        return head;
    }
}
