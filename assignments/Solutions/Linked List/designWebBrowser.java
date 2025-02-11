class BrowserHistory {
    class ListNode{
        String val;
        ListNode prev;
        ListNode next;
        ListNode(String value){
            this.val=value;
        }
    }
    ListNode curr;
    
    public BrowserHistory(String homepage) {
        curr=new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode newNode =new ListNode(url);
        curr.next=newNode;
        newNode.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
       while(steps>0 && curr.prev!=null){
        curr=curr.prev;
        steps--;
       }
       return curr.val;
    }
    
    public String forward(int steps) {
    while(steps>0 && curr.next!=null){
        curr=curr.next;
        steps--;
       }
       return curr.val;
    }
}
