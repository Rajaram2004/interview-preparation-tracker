package assignments.Solutions.Recursion;

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<0){
            return false;
        }
        return power(1,n);
    }
    public boolean power(int i,int n){
        if(i==n){
            return true;
        }
        if(i>n){
            return false;
        }
        return power(3*i,n);
    }
}

//without recursion ..leetcode optimized solution
// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if(n<=0)
//         return false;
//         while(n%3==0){
//             n/=3;
//         }
//         return n==1;
//     }
// }