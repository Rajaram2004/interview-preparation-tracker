class Solution {
    public int nthRoot(int n, int m) {
        int start=0;
        int end=m;
        while(start<=end){
            int mid=start+(end-start)/2;
            int power=(int)Math.pow(mid,n);
            if(power==m){
                return mid;
            }
            else if(power<m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}