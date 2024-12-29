public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Array: [1, 2, 3, ...]
        }

        int target = 10;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            start = end;
            end *= 2;
        }
        binary(arr, start, end, target);

    }

    private static void binary(int[] arr, int start, int end, int target) {
        int flag=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                flag=mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        if(flag>0)
        System.err.println("founded at the index of " + flag);
        else
        
        System.err.println("Not found");
    }
}