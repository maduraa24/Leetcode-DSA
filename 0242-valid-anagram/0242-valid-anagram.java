class Solution {
    public boolean isAnagram(String s, String t) {
       //if th lengths are diff, they cannot be anaagrams
       if(s.length()!=t.length()){
        return false;
       } 
       //create an array to count the frequencies
       int[] count=new int[26]; //english 26 alphabets

       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        //for every character in s, increase its character ie alphabet array count by 1;
        count[t.charAt(i)-'a']--;
        //for every character in t, decrease its character ie alphabet array count by 1;
       }
       //check if all the count has become 0 again
       for(int i=0;i<26;i++){
        if(count[i]!=0){
            return false;
        }
       }
       return true;
    }
}