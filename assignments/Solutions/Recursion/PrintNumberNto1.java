package assignments.Solutions.Recursion;

public class PrintNumberNto1 {
    public static void main(String[] args) {
        int n=0;
        Printnumber(n);
    }
    public static int Printnumber(int n){
        if(n==0){
            return 1;
        }
        System.out.println(n);
        return Printnumber(n-1);
        
    }
}
