import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int[] arr = new int[digits.length()];

        for (int i = 0; i < digits.length(); i++) {
            arr[i] = digits.charAt(i) - '0'; // Convert each character to integer
        }
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        solve(0, arr, ans, mapping, sb);
        return ans;
    }

    public void solve(int index, int[] arr, List<String> ans, String[] mapping, StringBuilder sb) {
        if (index == arr.length) {
            ans.add(new String(sb));
            return;
        }
        int currentvalue = arr[index];

        for (int i = 0; i < mapping[currentvalue].length(); i++) {

            sb.append(String.valueOf(mapping[currentvalue].charAt(i)));
            solve(index + 1, arr, ans, mapping, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}