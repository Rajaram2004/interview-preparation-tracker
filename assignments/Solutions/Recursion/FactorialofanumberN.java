package assignments.Solutions.Recursion;

public class FactorialofanumberN {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
            }
            private static int fact(int n) {
                if( n==1){
                    return 1;
                }
                return n*fact(n-1);
            }
}
