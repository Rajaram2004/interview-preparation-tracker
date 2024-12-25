class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
       int start=1;
       int end=num;

       while(start<=end){
        int mid=start+(end-start)/2;
        int multiply=num/mid;
        if(multiply==mid && num %mid ==0){
            return true;
        }
        else if(mid < multiply){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

        }
        return false;
    }      
}