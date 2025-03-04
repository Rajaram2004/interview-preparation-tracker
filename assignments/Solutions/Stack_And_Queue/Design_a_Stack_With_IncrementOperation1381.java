class CustomStack {
    class stack{
        int val;
        stack next;
        stack prev;
        stack(int val){
            this.val=val;
        }
    }
    stack top;
    stack head;
    int currSize=0;
    int max;
    public CustomStack(int maxSize) {
        top = new stack(-1);
        head=top;
        max=maxSize;
    }
    
    public void push(int x) {
        if(currSize<max){
            currSize++;
            stack newStack = new stack(x);
            top.next=newStack;
            newStack.prev=top;
            top=top.next;
        }
    }
    
    public int pop() {
        if(currSize==0) return -1;
        currSize--;
        int popval=top.val;
        top=top.prev;
        return popval;
    }
    
    public void increment(int k, int val) {
        if(currSize==0)return ;
        stack temp=head.next;
        for(int i=0;i<currSize && i< k ;i++){
            temp.val=temp.val+val;
            temp=temp.next;
        }
    }
}

