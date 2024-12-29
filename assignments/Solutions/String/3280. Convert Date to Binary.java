class Solution {
    public String convertDateToBinary(String date) {
        int num=0;
        int value=0;
        StringBuilder str =new StringBuilder();
        for( char ch : date.toCharArray())
            if(ch=='-'){
                str.append(Integer.toBinaryString(value));
                num=0;
                value=0;
                str.append('-');
            }
            else{
                num=Integer.parseInt(String.valueOf(ch)); 
                value=(value*10)+num;
            }
             str.append(Integer.toBinaryString(value));
                num=0;
                value=0;
                
        
        return str.toString();
    }
}
/*
 class Solution {
    public String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));
        return sb.toString();
    }
}
 */