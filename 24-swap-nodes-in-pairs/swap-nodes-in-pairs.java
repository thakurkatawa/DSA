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
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to handle edge cases, especially when the original head needs to be swapped.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 'prev' pointer helps to link the swapped pairs to the rest of the list.
        ListNode prev = dummy;

        // We need at least two nodes to perform a swap.
        // So, continue as long as 'prev.next' and 'prev.next.next' are not null.
        while (prev.next != null && prev.next.next != null) {
            // firstNode is the first node of the pair to be swapped
            ListNode firstNode = prev.next;
            ListNode secondNode = prev.next.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
 
            prev.next = secondNode;

            // Move 'prev' pointer two steps forward to the end of the current swapped pair.
            // This prepares 'prev' for the next pair of nodes.
            prev = firstNode;
        }


        return dummy.next;
    }
}