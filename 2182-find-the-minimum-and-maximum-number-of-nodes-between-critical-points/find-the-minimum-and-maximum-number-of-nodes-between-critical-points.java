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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
    int ans[] = new int[2];

    ListNode temp = head.next;
    ListNode prev = head;

    int mini = Integer.MAX_VALUE;
    int maxd = -1;
    int mind = Integer.MAX_VALUE;

    int c = 2;
    int first = -1;
    int last = -1;

    while (temp.next != null) {

        if ((temp.next.val > temp.val && prev.val > temp.val) ||
            (temp.next.val < temp.val && prev.val < temp.val)) {

            if (first == -1) {
                first = c;
            } else {
                mind = Math.min(mind, c - last);
            }

            last = c;
        }

        c++;
        temp = temp.next;
        prev = prev.next;
    }

    if (first != -1 && last != first) {
        maxd = last - first;
    }

    ans[0] = mind == Integer.MAX_VALUE ? -1 : mind;
    ans[1] = maxd;

    return ans;
}
}