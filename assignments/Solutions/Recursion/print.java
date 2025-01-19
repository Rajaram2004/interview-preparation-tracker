import java.util.HashMap;  
public class print {
    public static void main(String[] args) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(1,5);
       mp.put(1,mp.get(1)+10);
       mp.put(2,20);
       System.out.println(mp);
                                                                                      
    }
}
