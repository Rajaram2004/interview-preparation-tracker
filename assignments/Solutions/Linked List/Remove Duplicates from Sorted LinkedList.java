// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

// Example 1:


// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:


// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int prev_val=Integer.MAX_VALUE;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(temp.val==prev_val){
               prev.next=temp.next;
               temp=temp.next;
            }else{
                prev_val=temp.val;
                prev=temp;
                temp=temp.next;
                }
        }
        return head;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode node){
            this.val=val;
            this.next=node;
        }
    }
}