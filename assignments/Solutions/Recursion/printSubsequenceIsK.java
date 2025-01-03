
// print all subsequences
/* 
import java.util.ArrayList;
import java.util.List;

public class printSubsequenceIsK {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int[] arr={1,2,1};
        int sum=0;
        int target=2;
        printsub(0,arr,list,sum,target);
    }
    public static void printsub(int index , int[] arr, List<Integer> list, int sum,int target){
        if(index==arr.length){
            
            if(sum==target){
                System.out.println(list);
                System.out.println();
            }
            return;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        printsub(index+1, arr, list, sum, target);
        list.removeLast();
        sum=sum-arr[index];
        printsub(index+1, arr, list, sum, target);
    }
}
*/

//print onlu one subsequence
/* 
import java.util.ArrayList;
import java.util.List;

public class printSubsequenceIsK {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int[] arr={1,2,1};
        int sum=0;
        int target=2;
        printsub(0,arr,list,sum,target);
    }
    public static boolean printsub(int index , int[] arr, List<Integer> list, int sum,int target){
        if(index==arr.length){
            
            if(sum==target){
                System.out.println(list);
                System.out.println();
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        if(printsub(index+1, arr, list, sum, target)==true){
            return true;
        }
        list.removeLast();
        sum=sum-arr[index];
        if(printsub(index+1, arr, list, sum, target)==true) return true;
        return false;
    }
}
*/
//count number of subsequence present in the array

import java.util.ArrayList;
import java.util.List;

public class printSubsequenceIsK {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int[] arr={1,2,1};
        int sum=0;
        int target=2;
       System.out.println(printsub(0,arr,list,sum,target));
    }
    public static int printsub(int index , int[] arr, List<Integer> list, int sum,int target){
        if(index==arr.length){
            
            if(sum==target){
                System.out.println(list);
                System.out.println();
                return 1;
            }
            return 0;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        int l=printsub(index+1, arr, list, sum, target);
         
        list.removeLast();
        sum=sum-arr[index];
        int r= printsub(index+1, arr, list, sum, target);
        return l+r;
    }
}