import java.util.Arrays;

public class cyclic_sort {
    public static void sort(int[] arr, int n) {
        
        int i = 0;
        System.out.println(Arrays.toString(arr));
        while (i < n) {
            int currentIndex = arr[i]-1;
            if (arr[i] < n && arr[i] != arr[currentIndex] ) {
                int temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;

            } else {
                i++;
            }
        }
       
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,6 };
        int n = arr.length;
        sort(arr, n);
    }
}