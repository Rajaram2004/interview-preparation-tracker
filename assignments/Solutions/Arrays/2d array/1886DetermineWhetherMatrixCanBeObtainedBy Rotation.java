class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(isequal(mat,target)){
                return true;
            }
            rotate90(mat);
        }
        return false;
    }
    public boolean isequal(int[][] mat, int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate90(int[][] mat){
        int n=mat.length;
        int[][] rotate=new int[n][n];
        // transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[i][j]=mat[j][i];
            }
        }
        // rotation
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=rotate[i][n-j-1];
            }
        }
    }

}