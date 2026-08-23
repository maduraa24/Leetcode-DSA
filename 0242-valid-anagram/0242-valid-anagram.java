class Solution {
    public boolean isAnagram(String s, String t) {
        //if the lengths are diff, they cannot be anagrams
        if(s.length() != t.length()){
            return false;
        }
        //creating an array to count character frequencies
        int[] count = new int[26]; //assuming only lowercase English characters
        
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++; //whenever we find a character in 's',increase the array count by 1
            count[t.charAt(i) - 'a']--;//for every character present in t, decrement the array count by 1
        }
        //check if all the counts are zero ie 0
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
        
    }
  }
