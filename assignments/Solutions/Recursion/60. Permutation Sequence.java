import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> number = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            number.add(i);
        }
        number.add(n);
        k--;
        String ans = "";
        while (true) {
            ans += number.get(k / fact);
            number.remove(k / fact);
            if (number.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / number.size();
        }
        return ans;
    }
}

// time limit exceeded while n=8 and k=8590 test case(199)

// class Solution {
// public String getPermutation(int n, int k) {
// List<List<Integer>> ans=new ArrayList<>();
// int[] nums=new int[n];
// for(int i=0;i<n;i++){
// nums[i]=i+1;
// }
// boolean[] freq=new boolean[n];
// helper(nums,n,ans,new ArrayList<Integer>(),freq);
// StringBuilder sb=new StringBuilder();
// for(int value: ans.get(k-1)){
// sb.append(value);
// }

// return sb.toString();
// }
// public void helper(int[] nums,int n,List<List<Integer>> ans,List<Integer>
// list,boolean[] freq){
// if(list.size()==n){
// ans.add(new ArrayList<>(list));
// return;
// }
// for(int i=0;i<n;i++){
// if(!freq[i]){
// freq[i]=true;
// list.add(nums[i]);
// helper(nums,n,ans,list,freq);
// freq[i]=false;
// list.removeLast();
// }
// }
// }
// }