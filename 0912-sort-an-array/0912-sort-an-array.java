class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length < 2) return nums;

        int mid = nums.length / 2;
        int[] left = java.util.Arrays.copyOfRange(nums, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(nums, mid, nums.length);

        sortArray(left);
        sortArray(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            nums[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) nums[k++] = left[i++];
        while (j < right.length) nums[k++] = right[j++];

        return nums;
    }
}