import java.util.ArrayList;

public class Subsequences{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        int arr[]={3,1,2};
        sub(0,arr,"",list);
                
                    System.out.println(list);
                
    }
            private static void sub(int index, int[] arr, String str, ArrayList<String> list) {
                if(index==arr.length){
                    if(str.isEmpty()){
                        list.add("[]");
                    }else{
                        list.add(str);
                    }
                    return;
                }
                sub(index+1, arr, str+arr[index], list);
                sub(index+1, arr, str, list);
            }
}