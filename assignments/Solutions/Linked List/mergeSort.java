class Solution {
      public ListNode merge(ListNode firstHalf,ListNode secondHalf){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode temp1=firstHalf;
        ListNode temp2=secondHalf;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else {
            temp.next=temp1;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode firstHalf=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=slow.next;
        slow.next=null;
        firstHalf=sortList(firstHalf);
        secondHalf=sortList(secondHalf);

        ListNode ans=merge(firstHalf,secondHalf);

        return ans;
        
    }
  
}
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }