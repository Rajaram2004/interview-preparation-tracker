class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        int max = 0; 

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + gain[i];
            max = Math.max(max, arr[i + 1]); 
        }

        return max;
    }
}
