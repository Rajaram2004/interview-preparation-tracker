import java.util.Arrays;

public class right_rotation{
   
    public static void rotation(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
            System.out.print(Arrays.toString(arr));
            }
    private static void reverse(int[] arr, int start, int end) {
               while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
               }
            }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;

        rotation(arr,k);
    }
}