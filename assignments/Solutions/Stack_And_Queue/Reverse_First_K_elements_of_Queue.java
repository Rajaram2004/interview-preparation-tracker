class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    Stack<Integer> st=new Stack<>();
    int s=q.size()-k;
    for(int i=0;i<k;i++){
        st.push(q.remove());
    }
    while(!st.isEmpty()){
        q.add(st.pop());
    }
    for(int i=0;i<s;i++){
        q.add(q.remove());
    }
   
    return q;
    }
}