import java.util.Arrays;

public class CeillANDfllor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 17, 19 };
        int x = 18;
        Arrays.sort(arr);
        int n = arr.length;
        ceilANDfloor(arr, x, n - 1);
    }

    public static void ceilANDfloor(int[] arr, int x, int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                System.err.println(" floor " + arr[mid]);
                break;
            } else if (arr[mid] < x) {
                start = mid + 1;
            }

            else if (arr[mid] > x) {
                end = mid - 1;
            }
        }
        System.err.println(" floor " + arr[start]);
    }
}