class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        int minval=0;
        int maxval=0;

        if(n%2==1){
            int mid=n/2;
            ans[mid]=0;
            int min=mid,max=mid;
            for(int i=0;i<n/2;i++){
            ans[--min]=--minval;
            ans[++max]=++maxval;
            }
        }
        else{
            int minindex=n/2-1;
            int maxindex=minindex+1;
            for(int i=1;i<=n/2;i++){
                ans[minindex--]=--minval;
                ans[maxindex++]=++maxval;

            }
        }

        return ans;
    }
}