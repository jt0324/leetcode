package my;

/**
 * Created by dean on 16/10/8.
 */

import my.util.ListNode;

import java.lang.management.LockInfo;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode p = head;
        ListNode q;
        while (p.next != null){
            q = p.next;
            p.next = q.next;
            q.next = head;
            head = q;
        }
        return head;
    }
}
