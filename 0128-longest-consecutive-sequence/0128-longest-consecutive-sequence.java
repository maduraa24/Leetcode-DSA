class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for (int num : nums) {
            numset.add(num); //eliminates all the duplicate values n adds only unique values to the hashset
        }
        int longest = 0;
        for (int num : numset) { //running a for loop over numset
            if (!numset.contains(num - 1)) {
                int current = num;
                int count = 1;

                //for eg if 20 exists, while loop keeps checking the the next number lets say it checks for 21,22, when it doesnt find 23, it exits the while loop
                while (numset.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}

//space=0(n)
//time=0(n)