class Solution {
    public void changeZero(int[][] matrix,int rows ,int cols){
        for(int i=0;i<matrix[0].length;i++){
             matrix[rows][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
             matrix[i][cols]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix[0].length * matrix.length;
        if(n==1){
            return;
        }
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        int index=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr[index++]=i;
                    arr[index++]=j;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] >=0 && arr[i+1] >=0){
                changeZero(matrix,arr[i],arr[i+1]);
                i++;
            }
            else{
                break;
            }
        }
    }
}