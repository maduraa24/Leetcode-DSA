class Solution {
    public int trap(int[] height) {

        int left = 0; //left pointer
        int right = height.length - 1; //right pointer

        int leftMax = 0; //leftMax = tallest wall seen from the left.
        int rightMax = 0; //rightMax = tallest wall seen from the right.

        int water = 0; //Whenever we find a place that can hold water, we add that amount to water.

        while (left < right) {

            if (height[left] < height[right]) {
                // If the left block is shorter than the right block,
                // process the left side

                if (height[left] >= leftMax) { // Check if the current left block is a new tallest block
                    leftMax = height[left];// Update the tallest block seen from the left
                } else {
                    water += leftMax - height[left];
                    // The current block is shorter than the tallest
                    // left wall, so water can be trapped here
                    // Add the difference to the total water
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // The current block is shorter than the tallest
                    // right wall, so water can be trapped here
                    // Add the difference to the total water
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
