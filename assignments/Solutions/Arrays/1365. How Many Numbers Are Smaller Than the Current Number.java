class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int i,j,smallcount=0;
        int[] ans=new int[n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(nums[i]>nums[j]){
                        smallcount++;
                    }
                }

            }
            ans[i]=smallcount;
            smallcount=0;
        }
    return ans;
    }
}