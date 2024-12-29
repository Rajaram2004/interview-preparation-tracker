class Solution {

    public int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; //sorted array
    }
    

    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        int start = 0;
        int end = nums.length - 1;
        if (pivot != -1) {
            if (nums[0] <= target && nums[pivot] >= target) {
                start = 0;
                end = pivot;
            } else if (nums[end] >= target) {
                start = pivot + 1;
                end = nums.length - 1;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}