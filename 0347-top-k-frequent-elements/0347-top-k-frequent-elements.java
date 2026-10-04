class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // If k equals the array length, return the original array
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> hash = new HashMap<>(); //create a hashmap for number and occurence

        // Visit every number in the input array ie nums
        for (int n : nums) {

            // Increase the frequency of n by 1
            // If n is not in the map yet, start its count at 0
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>( //creating priority queue
                (a, b) -> hash.get(a) - hash.get(b)); //comparing the freq of 2 numbers

        // Visit each distinct number in the frequency map ie hash map
        for (int n : hash.keySet()) {
            // Add this number to the heap
            heap.add(n);
            // Keep only the k most frequent numbers in the heap
            if (heap.size() > k) {
                // Remove the number with the smallest frequency
                heap.poll();
            }
        }
        int[] ans = new int[k];
        //iterate through the heap n remove k numbers from the heap and store them in ans
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}