class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n*2];
        int f=0;
        int m=n;
        for(int i=0;i<n*2;i=i+2){
            ans[i]=nums[f++];
            ans[i+1]=nums[m++];
        }
     
        return ans;
    }
}