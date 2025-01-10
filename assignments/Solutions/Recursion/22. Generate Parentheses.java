import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        String sr = "";
        helper(0, 0, ans, n, sr);
        return ans;
    }

    public void helper(int open, int close, List<String> ans, int n, String sr) {
        if (sr.length() == n * 2) {
            ans.add(sr);
            return;
        }
        if (open < n) {
            helper(open + 1, close, ans, n, sr + "(");
        }
        if (close < open) {
            helper(open, close + 1, ans, n, sr + ")");
        }
    }
}