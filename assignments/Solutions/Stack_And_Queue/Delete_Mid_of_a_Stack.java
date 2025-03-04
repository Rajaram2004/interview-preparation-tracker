class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
       int sizeof=s.size();
       sizeof=(sizeof/2)+1;
    Stack<Integer> q=new Stack<>();
    int count=0;
    while(!s.isEmpty()){
        count++;
        if(count==sizeof){
            s.pop();
            continue;
        }
        q.push(s.pop());
    }
    while(!q.isEmpty()){
        s.push(q.pop());
    }
    }
}
/*class Solution {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // Calculate the middle index (1-based)
        int mid = (sizeOfStack + 1) / 2;
        solve(s, mid);
    }

    private void solve(Stack<Integer> s, int k) {
        // Base case: If we reach the middle, remove the element
        if (k == 1) {
            s.pop();
            return;
        }

        // Store the top element temporarily
        int top = s.pop();

        // Recursive call for the next element
        solve(s, k - 1);

        // Push the top element back onto the stack
        s.push(top);
    }
}
    */

