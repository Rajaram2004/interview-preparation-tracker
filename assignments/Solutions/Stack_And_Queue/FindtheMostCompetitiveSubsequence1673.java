class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n=nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>nums[i] && st.size()+(n-i-1)>=k){
                st.pop();
            }
            if(st.size()<k){
                st.push(nums[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}