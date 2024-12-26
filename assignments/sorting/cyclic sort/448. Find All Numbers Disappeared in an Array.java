class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int i=0;
        List<Integer> list=new ArrayList<Integer>();
        while(i < n){
            int currentIndex=nums[i]-1;
            if(nums[i] != nums[currentIndex]){
                int temp=nums[i];
                nums[i]=nums[currentIndex];
                nums[currentIndex]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(i+1 != nums[i]){
                list.add(i+1);
            }
        }
        return list;
    }
}