import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Sort the array alphabetically
        Arrays.sort(strs);

        // Get the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Store the common prefix
        StringBuilder result = new StringBuilder();

        // Compare characters of first and last strings
        for (int i = 0; i < first.length(); i++) {
            if (i >= last.length() || first.charAt(i) != last.charAt(i)) {
                break;
            }
            // Add matching character
            result.append(first.charAt(i));
        }

        return result.toString();
    }
}