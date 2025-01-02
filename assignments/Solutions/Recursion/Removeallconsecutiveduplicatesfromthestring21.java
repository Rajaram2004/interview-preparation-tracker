package assignments.Solutions.Recursion;
public class Removeallconsecutiveduplicatesfromthestring21 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char[] arr = s.toCharArray();
        StringBuilder str = new StringBuilder();
        str = remove(arr, 0, 1, str);
        System.out.println(str);

    }

    private static StringBuilder remove(char[] arr, int start, int end, StringBuilder str) {
        if (arr.length <= end) {
            str.append(arr[end-1]);
            return str;
        }
        if (arr[start] == arr[end]) {
            return remove(arr, start, end + 1, str);
        } else {
            str.append(arr[end-1]);
            start = end;

            return remove(arr, start, end + 1, str);
        }

    }
}