class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            boolean ispair = (mid % 2 == 0 && nums[mid] == nums[mid + 1])
                    || (mid % 2 == 1 && nums[mid] == nums[mid - 1]);
            if (ispair) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}