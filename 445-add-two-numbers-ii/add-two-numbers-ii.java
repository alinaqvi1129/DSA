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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
           int sum = carry;
           if(l1 != null){
            sum = sum + l1.val;
            l1 = l1.next;
           }
           if(l2 != null){
            sum = sum + l2.val;
            l2 = l2.next;
           }

           carry = sum / 10;
           curr.next = new ListNode(sum % 10);
           curr = curr.next;
           
        }
        return reverse(dummy.next);
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next; // save next
        curr.next = prev;          // reverse link
        prev = curr;               // move prev
        curr = next;               // move curr
    }

    return prev;
    }
}