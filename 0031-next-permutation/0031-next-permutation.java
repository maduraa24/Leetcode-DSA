class Solution {
    public void nextPermutation(int[] nums) {

        // Step 1: Start from the second-last index
        int i = nums.length - 2;

        // Move left while numbers are in descending order
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If we found a pivot, find a number bigger than it
        if (i >= 0) {
            int j = nums.length - 1;

            // Search from the right for the first number
            // that is bigger than the pivot
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap the pivot with that number
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse everything to the right of the pivot
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            // Swap the left and right numbers
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move inward
            left++;
            right--;
        }
    }
}
