// 2. Add Two Numbers
// Solved
// Medium
// Topics
// Companies
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Example 1:
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

// Example 2:
// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]
 

// Constraints:

// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros.

class Solution {
    public AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {
        AddTwoNumbers head =new AddTwoNumbers(-1,null);
        return helper(l1,l2,head);
    }
    public AddTwoNumbers helper(AddTwoNumbers l1, AddTwoNumbers l2 ,AddTwoNumbers head){
        int sum=0;
        int carry=0;
        AddTwoNumbers temp=head;
        while(l1!=null || l2!=null){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            AddTwoNumbers newNode = new AddTwoNumbers(sum%10,null);
            temp.next=newNode;
            temp=temp.next;
            carry=sum/10;
        }
        while(!(carry<1)){
             AddTwoNumbers newNode = new AddTwoNumbers(carry%10,null);
            temp.next=newNode;
            temp=temp.next;
            carry/=10;
        }
        return head.next;
    }
}
class AddTwoNumbers {
    int val;
    AddTwoNumbers next;
    AddTwoNumbers() {}
    AddTwoNumbers(int val) { this.val = val; }
    AddTwoNumbers(int val, AddTwoNumbers next) { this.val = val; this.next = next; }
}