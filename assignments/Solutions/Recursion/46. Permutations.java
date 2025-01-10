import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
         helper(0,nums,ans);
       return ans;
    }
    public void helper(int index ,int[] nums ,List<List<Integer>> ans ){
        if(nums.length == index){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                list.add(nums[j]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            helper(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i,int index,int[] nums){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}




// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         boolean[] flags = new boolean[nums.length];
//         helper(flags,nums,ans,new ArrayList<>());
//         return ans;
//     }
//     public void helper(boolean[] flags ,int[] nums ,List<List<Integer>> ans ,
//     List<Integer> list){
//         if(nums.length == list.size()){
//             ans.add(new ArrayList(list));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(!flags[i]){
//                 flags[i]=true;
//                 list.add(nums[i]);
//                 helper(flags ,nums ,ans ,list);
//                 list.removeLast();
//                 flags[i]=false;
//                 }
//             }
//         }
// }