// Given two strings s and p, return an array of all the start indices of p's 
// anagrams
//  in s. You may return the answer in any order.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
// Example 2:

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".
 

// Constraints:

// 1 <= s.length, p.length <= 3 * 104
// s and p consist of lowercase English letters.

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        List<Integer> ans=new ArrayList<>();
        
        
        for(int i=0;i<=n-p.length();i++){
            int flag=0;
            int[] hash=new int[26];
            for(int j=0;j<p.length();j++){
                hash[p.charAt(j)-'a']++;
                hash[s.charAt(i+j)-'a']--;
            }
            for(int k=0;k<26;k++){
                 if(hash[k]!=0){
                    flag=1;
                    break;
                 }
            }
            if(flag==0){
                ans.add(i);
            }
            
        }
        return ans;
    }
}