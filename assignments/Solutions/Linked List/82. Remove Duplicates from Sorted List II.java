// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

// Example 1:

// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]
// Example 2:

// Input: head = [1,1,1,2,3]
// Output: [2,3]

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;

        }
        return dummy.next;
    }
}

// class Solution {
// public ListNode deleteDuplicates(ListNode head) {
// ListNode temp=head;
// int arr[]=new int[200];
// while(temp!=null){
// arr[temp.val+100]++;
// temp=temp.next;
// }
// ListNode dummy=new ListNode(-101);
// ListNode dummyhead=dummy;
// temp=head;
// for(int i=0;i<200;i++){
// if(arr[i]==1){
// int val=i-100;
// ListNode newNode =new ListNode(val);
// dummy.next=newNode;
// dummy=newNode;
// }
// }
// return dummyhead.next;
// }
// }
