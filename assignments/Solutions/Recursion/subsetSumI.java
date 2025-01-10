import java.util.ArrayList;
import java.util.List;

public class subsetSumI {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        List<Integer> list = new ArrayList<Integer>();
        sub(0, arr, list,0);

    }

    public static void sub(int index, int[] arr, List<Integer> list,int sum) {
        if (arr.length == index) {
            list.add(sum);
            System.out.println(list);
            return;
        }
        sum=sum+arr[index];
        sub(index + 1, arr, list,sum);
        sum=sum-arr[index];
        list.removeLast();
        sub(index+1, arr, list,sum);

    }
}