class Solution {
    public int findDays(int[] nums,int capacity){
        int load=0;
        int days=1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i] > capacity){
                days++;
                load=nums[i];
            }
            else{
                load+=nums[i];
                max=Math.max(max,load);
            }
        }
        
        return days;
    }
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            end+=nums[i];
            start=Math.max(start,nums[i]);
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            int reqDays=findDays(nums,mid);
            if(reqDays<=k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return start;
    }
}