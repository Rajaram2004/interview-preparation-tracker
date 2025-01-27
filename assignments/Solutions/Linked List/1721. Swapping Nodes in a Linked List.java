// You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]
// Example 2:

// Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
// Output: [7,9,6,6,8,7,3,0,9,5]

// Constraints:

// The number of nodes in the list is n.
// 1 <= k <= n <= 105
// 0 <= Node.val <= 100

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode beginNode = fast;
        ListNode slow = head;
        if (fast == null)
            return head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int val = beginNode.val;
        beginNode.val = slow.val;
        slow.val = val;
        return head;
    }
}