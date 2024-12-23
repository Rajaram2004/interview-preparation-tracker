// Find the number of elements that contains even digit in an array. nums = [123, 43, 453, 4332, 123456, 1234]. Output = 4
public class number_of_elements_that_contains_even_digit_in_an_array {
    public static void main(String[] args) {
        int[] arr={1123,234,5526,356367,222,314556};
        int n=arr.length;
        even_digits(arr,n);
        }
        
            private static void even_digits(int[] arr, int n) {
                int c=0;
                for(int i=0;i<n;i++){
                    int res=(((int)Math.log10(arr[i]))+1);
                    if(res%2==0){
                        c++;
                    }
                }
                System.err.println(c);
            }
}
