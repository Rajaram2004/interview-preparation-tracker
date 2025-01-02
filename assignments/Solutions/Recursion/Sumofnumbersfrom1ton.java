package assignments.Solutions.Recursion;

public class Sumofnumbersfrom1ton {
    public static void main(String[] args) {
        int n=10;
        System.out.println(calculate(n));
        
            }
        
            private static int calculate(int n) {
                if(n==0){
                    return 0;
                }
                
                return n + calculate(n-1);
            }
}
