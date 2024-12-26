class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i < n){
            int currentIndex=nums[i]-1;
           
            
            if(nums[i] !=i+1){
                if(nums[i]==nums[currentIndex])
                    return nums[i];
                int temp=nums[i];
                nums[i]=nums[currentIndex];
                nums[currentIndex]=temp;
            }
            else{
                i++;
            }
            
        }
        return -1;
    }
}