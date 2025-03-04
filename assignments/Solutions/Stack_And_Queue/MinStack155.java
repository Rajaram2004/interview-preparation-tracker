class MinStack155 {
    class ListNode {
        int val,min;
        ListNode prev,next;
        ListNode(int value,int minimum){
            this.val=value;
            this.min=minimum;
        }
    }
    int mini=Integer.MAX_VALUE;
    ListNode curr;
    public MinStack155() {
       
        curr=new ListNode(0,mini);
    }
    
    public void push(int val) {
         mini=mini < val ? mini : val;
         ListNode newNode = new ListNode(val,mini);
         curr.next=newNode;
         newNode.prev=curr;
         curr=curr.next;
    }
    
    public void pop() {
        curr=curr.prev;
        mini=curr.min;
    }
    
    public int top() {
        return curr.val;
    }
    
    public int getMin() {
        return curr.min;
    }
}