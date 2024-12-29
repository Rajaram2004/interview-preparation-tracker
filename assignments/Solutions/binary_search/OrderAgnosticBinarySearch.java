public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int target = 2;
        int index = Search(arr, target);
        System.err.println(" founded at the index of " + index);
    }

    private static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (isasscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
