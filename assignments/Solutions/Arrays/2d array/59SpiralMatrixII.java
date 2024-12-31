class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int value=1,top=0,bottom=n,left=0,right=n;

        while(left < right && top < bottom){
            for(int i=left;i<right;i++){
                matrix[top][i]=value++;
            }
            top++;
            for(int i=top;i<bottom;i++){
                matrix[i][right-1]=value++;
            }
            right--;
           
            for(int i=right-1;i>=left;i--){
                matrix[bottom-1][i]=value++;
            }
            bottom--;
            for(int i=bottom-1;i>=top;i--){
                matrix[i][left]=value++;
            }
            left++;
        }
        return matrix;
    }
}