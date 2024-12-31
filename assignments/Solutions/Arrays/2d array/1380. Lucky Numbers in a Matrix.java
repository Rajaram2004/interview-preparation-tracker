class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int max=0,min=0;
        int n=matrix.length;
        List<Integer> maxElement=new ArrayList<Integer>();
        List<Integer> minElement=new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            min=matrix[i][0];
            for(int j=1;j<m;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            minElement.add(min);
        }
         for(int i=0;i<m;i++){
            max=matrix[0][i];
            for(int j=1;j<n;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            maxElement.add(max);
        }
        System.out.println(minElement.toString());
        System.out.println(maxElement.toString());
        for (int min1 : minElement) {
            if (maxElement.contains(min1)) {
                ans.add(min1);
            }
        }
        return ans;
    }
}