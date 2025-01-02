package assignments.Solutions.Recursion;
public class CheckifanArrayisSorted {
    public static void main(String[] args) {
        int[] arr = { 20, 21, 22, 23, 21 };
        if (check(arr, 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean check(int[] arr, int i) {
        if (arr.length == i) {
            return true;
        }
        if (arr[i - 1] > arr[i]) {
            return false;
        }
        return check(arr, i + 1);

    }
}