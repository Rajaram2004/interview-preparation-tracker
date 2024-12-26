class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != i + 1) {
                if (nums[i] == nums[currentIndex]) {
                    i++;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[currentIndex];
                    nums[currentIndex] = temp;
                }
            } else {
                i++;
            }

        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                list.add(nums[i]);
        }
        return list;
    }
}