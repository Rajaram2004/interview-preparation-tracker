class Solution {
    public int mySqrt(int x) {
       int start=1,end=x;
       if(x==0){
        return 0;
       }
       while(start <= end){
        int mid=start+(end-start)/2;
        if(mid== x/mid){
            return mid;
        }
        else if(mid < x/mid){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       }
       return end;
    }
}


// for(int i=0;true;i++)
// if(i*i>x||i*i<0)
// return i-1;


/* class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        long i=1;
        long sq=i*i;
        while(x>=sq){
            i++;
            sq=i*i;
        }
        return (int)(i-1);
    }
}
*/