//assignments/linear

import java.util.Scanner;

public class min_element {
    public static void min_element(int[] arr,int n){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=i;
            }
        }
        System.err.println(min);;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        
        min_element(arr,n);
    }
}
