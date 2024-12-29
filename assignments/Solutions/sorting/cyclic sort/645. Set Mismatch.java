class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i=0;
        int n=nums.length;
        while(i < n){
            int currentIndex=nums[i]-1;
            if(nums[i] != i+1){
                if(nums[i]==nums[currentIndex]){
                    i++;
                }
                else{
                    int temp =nums[i];
                    nums[i]=nums[currentIndex];
                    nums[currentIndex]=temp;
                }

            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                arr[0]=nums[i];
                arr[1]=i+1;
                break;
            }
        }
        return arr;
    }
}