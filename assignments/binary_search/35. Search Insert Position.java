class Solution {
    public int BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        return start;
    }

    public int searchInsert(int[] nums, int target) {
        int PresentIndex = BinarySearch(nums, target);
        return PresentIndex;
    }
}