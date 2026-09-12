class Solution {

    public boolean checkInclusion(String s1, String s2) {

        // If s1 is bigger than s2, permutation cannot exist
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency map of s1
        HashMap<Character, Integer> s1Map = new HashMap<>();

        // Frequency map of current window in s2
        HashMap<Character, Integer> s2Map = new HashMap<>();

        // Build both frequency maps
        for (int i = 0; i < s1.length(); i++) {

            // Increase frequency of current character in s1
            s1Map.put(s1.charAt(i),
                    s1Map.getOrDefault(s1.charAt(i), 0) + 1);

            // Increase frequency of current character in first window of s2
            s2Map.put(s2.charAt(i),
                    s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // If first window itself is a permutation
        if (s1Map.equals(s2Map)) {
            return true;
        }

        // Slide the window one character at a time
        for (int i = s1.length(); i < s2.length(); i++) {

            // Character entering the window
            char add = s2.charAt(i);

            // Increase its frequency
            s2Map.put(add,
                    s2Map.getOrDefault(add, 0) + 1);

            // Character leaving the window
            char remove = s2.charAt(i - s1.length());

            // Decrease its frequency
            s2Map.put(remove, s2Map.get(remove) - 1);

            // Remove it completely if frequency becomes 0
            if (s2Map.get(remove) == 0) {
                s2Map.remove(remove);
            }

            // Compare the two maps
            if (s1Map.equals(s2Map)) {
                return true;
            }
        }

        // No permutation found
        return false;
    }
}