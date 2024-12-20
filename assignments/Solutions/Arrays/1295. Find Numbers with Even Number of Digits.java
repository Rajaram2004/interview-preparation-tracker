class Solution {
    public int numberofdigit(int nums){
        int count =0;

        while(nums>0){
            count++;
            nums/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        int result=0;
        for(int i=0;i<n;i++){
           result= numberofdigit(nums[i]);
           if(result%2==0)
           count++;
        }
        return count;
    }
}

// if ( (((int) Math.log10(nums[i])) & 1) == 1 ) count++;
// & 1 is used for odd / & 0 for even 