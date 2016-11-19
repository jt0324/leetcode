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
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p = l1,q = l2;
        if (p.val < q.val){
            head = new ListNode(p.val);
            p = p.next;
        }
        else {
            head = new ListNode(q.val);
            q = q.next;
        }
        ListNode s = head;
        while (p != null && q != null){
            if (p.val < q.val){
                s.next = p;
                p = p.next;
            }
            else{
                s.next = q;
                q = q.next;
            }
            s = s.next;
        }
        if (p != null){
            s.next = p;
        }
        if (q != null)
            s.next = q;
        return head;
    }
}
