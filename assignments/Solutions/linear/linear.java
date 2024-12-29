import java.util.Scanner;

public class linear{
    public static void search(int [] arr,int target,int n){
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
    }
    if(index>=0){
        System.err.println("index position is " +index);
    }
    else{
        System.err.println("Not found");
    }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        int target =sc.nextInt();
        search(arr,target,n);
    }
}