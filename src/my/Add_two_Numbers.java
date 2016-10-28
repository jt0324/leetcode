package my;

/**
 * Created by dean on 16/9/30.
 */

import my.util.ListNode;

import java.lang.management.LockInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Add_two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        ListNode newNode = null;
        ListNode p1 = l1;
        ListNode p2 = l2;
        head.next = null;
        int sum = 0,d = 0,r = 0;
        while (p1 != null || p2 != null){
            sum = ((p1 != null? p1.val:0) + (p2 != null?p2.val : 0)) + r;
            d = sum % 10;
            newNode = new ListNode(d);
            newNode.next = null;
            r = sum / 10;
            p.next = newNode;
            p = p.next;
            if(p1 != null)
                p1 = p1.next;
            if(p2 != null)
                p2 = p2.next;
        }
        if(r == 1){
            p.next = new ListNode(1);
        }
        return head.next;
    }

}
