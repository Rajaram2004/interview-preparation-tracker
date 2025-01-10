// 40. Combination Sum II
// Solved
// Medium
// Topics
// Companies
// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.

 

// Example 1:

// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]
// Example 2:

// Input: candidates = [2,5,2,1,2], target = 5
// Output: 
// [
// [1,2,2],
// [5]
// ]
 

// Constraints:

// 1 <= candidates.length <= 100
// 1 <= candidates[i] <= 50
// 1 <= target <= 30

import java.util.ArrayList;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans=new ArrayList<>();
    sum2(0,candidates,target,ans,new ArrayList<>());
    
    return ans;
    }

    public void sum2(int index,int[] candidates, int target, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<candidates.length;i++){
            if(i > index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            list.add(candidates[i]);
            target=target-candidates[i];
            sum2(i+1,candidates,target,ans,list);
            list.remove(list.size()-1);
            target=target+candidates[i];
            
        }

    }
}