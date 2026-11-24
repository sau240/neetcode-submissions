/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode top = head;
        ListNode tail = head;

        while(tail != null && tail.next != null) {
            top = top.next;
            tail = tail.next.next;

            if(tail == top) {
                return true;
            }
        }
        return false;
    }
}
