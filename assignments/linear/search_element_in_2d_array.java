public class search_element_in_2d_array {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6},{7,8}};
        
        int target=8;
        int n=arr.length;
        search(arr,n,target);
    }
        
            private static void search(int[][] arr, int n,int target) {
                
                for(int i=0;i<n;i++){
                    for(int j=0;j<arr[i].length;j++){
                        if(arr[i][j]==target){
                            System.err.println("index i : "+i +" j : "+j);
                            break;
                        }
                    }
                }
                
            }
}
