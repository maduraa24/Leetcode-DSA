import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // First pass: Find two potential candidates
        for (int num : nums) {

            if (count1 > 0 && num == candidate1) {
                count1++;
            } else if (count2 > 0 && num == candidate2) {
                count2++;
            } else if (count1 == 0) { //when we get a new candidate
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) { //when we get a new candidate
                candidate2 = num;
                count2 = 1;
            } else { //if num is not equal to candidate
                count1--;
                count2--;
            }
        }

        // Second pass: Verify the actual frequencies
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Store the valid majority elements
        List<Integer> result = new ArrayList<>();

        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}