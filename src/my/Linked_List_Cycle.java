package my;

/**
 * Created by dean on 16/11/19.
 */

import my.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        while (p != null){
            if (p.next == head) return true;
            ListNode temp = p.next;
            p.next = head;
            p = temp;
        }
        return false;
    }
}
