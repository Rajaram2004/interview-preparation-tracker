class Solution {
    public int diagonalSum(int[][] mat) {
        int end=mat[0].length;
        int sum=0;
        int pointerEnd=end-1;
        int pointerStart=0;
        for(int i=0;i<mat.length;i++){
            if(pointerStart==pointerEnd){
                sum+=mat[i][pointerStart++];
                pointerEnd--;
            }else{
                sum+=mat[i][pointerStart++];
                sum+=mat[i][pointerEnd--];
            }
        }
        return sum;
    }
}