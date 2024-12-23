public class max_element {
    //assignments/linear


    public static void max_element(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=i;
            }
        }
        System.err.println(max);;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        
        max_element(arr,n);
    }
}


