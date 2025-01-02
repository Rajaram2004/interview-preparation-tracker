// Input : A = {1, 2, 3, 4, 5}
// Output : [48]
//          [20, 28] 
//          [8, 12, 16] 
//          [3, 5, 7, 9] 
//          [1, 2, 3, 4, 5]
import java.util.Arrays;
public class SumTrianglefromArray{
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        triangle(arr);
    }
    public static void triangle(int A[]){
        if(A.length<1){
            return;
        }
        int nums[]=new int[A.length-1];
        for(int i=0;i<A.length-1;i++){
            int x=A[i]+A[i+1];
            nums[i]=x;
        }
        triangle(nums);
        System.out.println(Arrays.toString(A));

    }
}