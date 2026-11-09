class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Stores the common characters
        StringBuilder result = new StringBuilder();

        // Outer loop: goes through each character position
        // of the first word
        for (int i = 0; i < strs[0].length(); i++) {

            // Get the character at index i from the first word
            char ch = strs[0].charAt(i);

            // Inner loop: checks the same position
            // in all the remaining words
            for (int j = 1; j < strs.length; j++) {

                // Check if the word is too short OR
                // if the character doesn't match
                if (i >= strs[j].length() ||
                    strs[j].charAt(i) != ch) {

                    // Return the common prefix found so far
                    return result.toString();
                }
            }
            // If every word matched, add the character
            result.append(ch);
        }
        // Return the result if we finish the outer loop
        return result.toString();
    }
}