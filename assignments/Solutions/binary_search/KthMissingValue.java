class Solution {
    public int findKthPositive(int[] arr, int k) {
       int start=0;
       int end=arr.length;
       int missing_count;
       while(start<end){
        int mid=start+(end-start)/2;
        missing_count=arr[mid]-(mid+1);
        if(missing_count<k){
            start=mid+1;
        }
        else if(missing_count>=k){
            end=mid;
        }
       }
       int beforestart= start ==0 ? 0: arr[start-1]-start;

       return start== 0 ? k : arr[start-1]+(k-beforestart) ;

    }
}