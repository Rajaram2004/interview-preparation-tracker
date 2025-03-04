import java.util.Stack;

public class Remove_Outermost_Parentheses1021 {
     public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch=='(' ){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }else {
               st.pop();
               if(!st.isEmpty()){
                sb.append(ch);
               }
            }
        }
        return sb.toString();
    }
}
/* 
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0; // To track nesting level

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) { // Ignore outermost '('
                    result.append(c);
                }
                depth++; // Increase depth
            } else {
                depth--; // Decrease depth
                if (depth > 0) { // Ignore outermost ')'
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
*/