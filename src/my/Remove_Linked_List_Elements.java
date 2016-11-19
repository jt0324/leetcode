package my;

/**
 * Created by dean on 16/11/19.
 */

import my.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        while (head != null && head.val == val) head = head.next;
        ListNode p = head;
        while (p != null && p.next!= null){
            if (p.next.val == val) p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }
}
