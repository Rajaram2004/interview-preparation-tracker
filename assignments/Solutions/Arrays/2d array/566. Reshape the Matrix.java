class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] newmat=new int[r][c];
        if(n*m != r*c){
            return mat;
        }
        else{
            
            int arr[]=new int[n*m];
            int index=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[index++]=mat[i][j];
                }
            }
            index=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    newmat[i][j]=arr[index++];
                }
            }
        }
        return newmat;
    }
}