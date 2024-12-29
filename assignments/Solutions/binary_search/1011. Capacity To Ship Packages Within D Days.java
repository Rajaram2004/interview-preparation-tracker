class Solution {
    public int findDays(int[] weights, int capacity ){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                day++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<weights.length;i++){
            end+=weights[i];
            start=Math.max(start,weights[i]);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int reqdays=findDays(weights,mid);
            if(reqdays<=days){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}