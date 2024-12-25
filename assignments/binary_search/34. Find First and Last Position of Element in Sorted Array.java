class Solution {
    public int fposition(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return index;
    }
    public int lposition(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=fposition(nums,target);
        int last=lposition(nums,target);
        int ans[]=new int[2];
        if(first == -1 || last == -1){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
    }
    else if(first == last ){
             ans[0]=first;
            ans[1]=last;
            return ans;
    }
     ans[0]=first;
            ans[1]=last;
            return ans;
}
}