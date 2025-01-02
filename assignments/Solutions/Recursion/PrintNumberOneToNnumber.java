package assignments.Solutions.Recursion;

public class PrintNumberOneToNnumber {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }

    /**
     * @param n
     */
    private static void printNumbers(int n) {
        if (n == 0)
            return;
       
        printNumbers(n - 1);
        System.out.println(n);
    }
}
