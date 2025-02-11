// You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

// Example 1:


// Input: l1 = [7,2,4,3], l2 = [5,6,4]
// Output: [7,8,0,7]
// Example 2:

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [8,0,7]
// Example 3:

// Input: l1 = [0], l2 = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros.
 

// Follow up: Could you solve it without reversing the input lists?

import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode ans =null;
        Stack<Integer> s1 =new Stack<>();
        Stack<Integer> s2 =new Stack<>();
        while(t1!=null){
            s1.push(t1.val);
            t1=t1.next;
        }
        while(t2!=null){
            s2.push(t2.val);
            t2=t2.next;
        }
       int carry=0;
       int sum=0;
        while( !(s1.isEmpty()) || !(s2.isEmpty()) || carry!=0){
            sum=carry;
            if(!(s1.isEmpty())){
                sum+=s1.pop();
            }
            if(!(s2.isEmpty())){
                sum+=s2.pop();
            }
            ListNode newNode = new ListNode(sum%10);
           
           newNode.next=ans;
           ans=newNode;
        carry=sum/10;
        }
        return ans;
     
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