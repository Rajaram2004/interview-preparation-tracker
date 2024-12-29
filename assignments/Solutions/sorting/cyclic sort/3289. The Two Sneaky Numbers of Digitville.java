class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int i = 0, index = 0;
        int n = nums.length;
        while (i < n) {
            int currentIndex = nums[i];
            if (nums[i] != nums[currentIndex]) {
                int temp = nums[i];
                nums[i] = nums[currentIndex];
                nums[currentIndex] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i) {
                arr[index++] = nums[i];
            }
        }
        return arr;
    }
}