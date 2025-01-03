class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        reverse(s, 0, n - 1);
    }

    public void reverse(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s, start + 1, end - 1);
    }
}