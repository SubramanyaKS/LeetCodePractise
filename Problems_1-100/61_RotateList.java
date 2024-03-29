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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while (temp!= null) {
            temp = temp.next;
            count ++;
        }
        k = k % count;
        for (int i = 0; i < k ; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        ListNode result = slow.next;
        slow.next = null;
        return result;
        
    }
   
}