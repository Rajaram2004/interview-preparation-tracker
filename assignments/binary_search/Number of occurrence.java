class Solution {
    public int first1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                result = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return result;
    }

    public int last(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                result = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return result;
    }

    int countFreq(int[] arr, int target) {
        int first = first1(arr, target);
        int last = last(arr, target);
        if (last == -1 || first == -1) {
            return 0;
        }

        return last - first + 1;
    }
}
