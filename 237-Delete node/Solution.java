/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //creating an temp pointing to node next
        // 1->2->3->4 if node is 3 t wil point to 4
        ListNode t=node.next;
        node.val=t.val; // node.val =3 t.val=4 so node.val = 4 1->2->4->4
        node.next=t.next;//node.next=t.next 1->2->4
        t.next=null;//t.next=null;
    }
}