class Solution {
    public String subString(String s, int start, int end) {
        int sum = 0, val;

        for (int i = start; i < end; i++) {
            val = (int) s.charAt(i);
            val = val - 97;
            sum += val;
        }
        sum = sum % 26;
        sum = sum + 97;
        char ch = (char) sum;
        System.out.println(ch);
        return Character.toString(ch);
    }

    public String stringHash(String s, int k) {
        int n = s.length();
        int start = 0;
        int end = k;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n / k; i++) {
            str.append(subString(s, start, end));
            start += k;
            end = end + k;
        }
        String result = str.toString();
        return result;
    }
}

/*
 * optimal solution
 * class Solution {
 * public String stringHash(final String s, final int k) {
 * final StringBuilder sb = new StringBuilder();
 * 
 * for(int i = 0; i < s.length(); i += k) {
 * final int size = i + k;
 * int sum = 0;
 * 
 * for(int j = i; j < size; ++j)
 * sum += s.charAt(j) - 'a';
 * 
 * sb.append((char) (sum % 26 + 'a'));
 * }
 * 
 * return sb.toString();
 * }
 * }
 */