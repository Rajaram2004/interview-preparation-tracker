class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        int count = 0;
        for (String s : sentences) {
            count = s.split(" ").length;
            maxlen = Math.max(count, maxlen);
        }
        return maxlen;
    }
}