package my;

/**
 * Created by dean on 16/11/22.
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
public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head,p = odd,even = head.next,q = even;
        while (p.next != null && q.next != null){
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = even;
        return odd;
    }
}
