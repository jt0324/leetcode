package my;

/**
 * Created by dean on 16/11/19.
 */

import my.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA,q = headB;
        while (p != q){
            p = p == null?headB:p.next;
            q = q == null?headA:q.next;
        }
        return p;
    }
}
