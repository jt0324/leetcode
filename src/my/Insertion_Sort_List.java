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
public class Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head.next,q = p.next;
        head.next = null;
        while (p != null){
            ListNode s = head;
            while (s != null){
                if (s == head && p.val <= s.val){
                    p.next = head;
                    head = p;
                }
                else if (s.next == null){
                    p.next = s.next;
                    s.next = p;
                }
                else if(p.val >= s.val && p.val < s.next.val){

                    p.next = s.next;
                    s.next = p;
                }
                s = s.next;
            }
            p = p.next;
            if (p == null) break;
            q = q.next;

        }

        return head;
    }
}
