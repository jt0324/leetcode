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
public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head,q = head.next;
        while (p != null && q != null){
            int temp = p.val;
            p.val = q.val;
            q.val = temp;
            p = q.next;
            if (q.next == null) break;
            q = p.next;
        }
        return head;
    }
}
