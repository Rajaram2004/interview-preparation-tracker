// recursion
class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=1;
        return power(i,n);
    }
    
    public boolean power(int i,int n){
        if(n==i){
            return true;
        }
        if( i > n){
            return false;
        }
        return power(2*i,n);
    }
}

//bit manipulation

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n <= 0) return false; // 0 and negative numbers are not powers of two
//         return (n & (n - 1)) == 0; // Check if exactly one bit is set
//     }
// }
