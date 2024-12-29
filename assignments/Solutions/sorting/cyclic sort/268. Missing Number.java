class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int currentIndex=nums[i];
            
             if(nums[i]<n && nums[i]!=nums[currentIndex]){
                int temp=nums[i];
                nums[i]=nums[currentIndex];
                nums[currentIndex]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i)
                return i;
        }
        return n;
    }
}