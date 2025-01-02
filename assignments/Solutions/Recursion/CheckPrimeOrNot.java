package assignments.Solutions.Recursion;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        if(checkPrime(2,7)){
            System.out.println("YES");
        }
        else
                System.out.println("no");
            }
        
            private static boolean checkPrime(int i,int n) {
                if(n%i==0){
                    return false;
                }
                if(i*i>n){
                    return true;
                }
                return checkPrime(i+1, n);
            }
}
