  

public class Productof2NumbersusingRecursion12 {
    public static void main(String[] args) {
        System.out.println(product(7,2));
    }
    public static int product(int x,int y){
        if(x<y){
            return product(y,x);
        }
        else if(y!=0){
            return x + product(x,y-1);
        }
        else{
            return 0;
        }
    }
}
