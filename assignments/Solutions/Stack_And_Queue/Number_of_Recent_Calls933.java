class RecentCounter { 
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    ListNode start;
    ListNode end;
    public RecentCounter() {
       ListNode dummy=new ListNode(0);
       start=dummy;
       end=dummy;
    }
    
    public int ping(int t) {
        ListNode newNode=new ListNode(t);
        end.next=newNode;
        end=end.next;
        return counter(t);
    }
    public int counter(int t){
        ListNode temp=start.next;
        int count=0;
        int startval=t-3000;
        while(temp!=null){
            if(startval<=temp.val && temp.val<=t)
                count++;
                temp=temp.next;
        }
        return count;
    }
}