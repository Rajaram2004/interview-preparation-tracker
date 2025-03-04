class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j-i]+nums[j]==target){
                   return new int[]{j-i,j};
                }
            }
        }
    return new int[]{};
    }
}
/* 
O(n) time complexity and o(n) Space complexity
import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in the HashMap, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number with its index
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // If no solution is found
    }
}
*/

 