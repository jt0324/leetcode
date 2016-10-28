package my;

import my.util.ListNode;

/**
 * Created by dean on 16/10/7.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Delete_node_in_a_linked_list {
//    public void deleteNode(ListNode node) {
//        ListNode p = node,q = node.next;
//        while (q != null){
//            p.val = q.val;
//            if(q.next != null){
//                p = q;
//                q = q.next;
//            }
//            else {
//                p.next = null;
//                break;
//            }
//        }
//    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
