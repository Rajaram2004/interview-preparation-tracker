class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array
        
        int index = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check for unique elements
                nums[index++] = nums[i]; // Place the unique element at the next position
            }
        }
        
        return index; // Return the number of unique elements
    }
}