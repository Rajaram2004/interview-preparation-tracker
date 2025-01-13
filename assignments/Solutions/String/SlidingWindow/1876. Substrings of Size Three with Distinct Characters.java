class Solution {
    public int countGoodSubstrings(String s) {
      int count=0;
      for(int r=2;r<s.length();r++){
        char a=s.charAt(r-2);
        char b=s.charAt(r-1);
        char c=s.charAt(r);
        if(a!=b && b!=c && a!=c){
            count++;
        }
      }
      return count;
    }

}

//two pointer 20ms in leetcode

// class Solution {
//     public int countGoodSubstrings(String s) {
//         int count = 0;
//         int l = 0, r = 0;
//         int[] hash = new int[26];
//         while (r < s.length()) {
//             hash[s.charAt(r) - 'a']++;
//             if (valid(hash) == true) {
//                 count++;
//             }
//             if ((r - l + 1) == 3) {
//                 hash[s.charAt(l) - 'a']--;
//                 l++;
//             }
//             r++;
//         }
//         return count;
//     }
//     public boolean valid(int[] hash) {
//         int count = 0;
//         for (int i = 0; i < 26; i++) {
//             if (hash[i] == 1) {
//                 count++;
//             }

//         }
//         System.out.println();
//         if (count == 3) {
//             return true;
//         }
//         return false;
//     }

// }