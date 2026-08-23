class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
             if(strs.length == 0){ //if the length of the string is empty,return an empty array
                 return new ArrayList();
        }
        //initialize a HashMap, Key is string builder and list is the value
        Map<String, List> ansMap = new HashMap<>();
        
        //array of size 26 rep 26 characters of the englosh alphabet
        int[] count = new int[26];
        
        for(String s:strs){
            Arrays.fill(count, 0); //initialize array with value 0
            for(char c:s.toCharArray()){ //we are goin to iterate over the given string s and add all the characters inside this given array by adding their value from 0 to 1
                count[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder(""); //string builder to store the value that we got from the character array
            
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString(); //the new stringbuilder created will be assigned as the key to the hashmap
            if(!ansMap.containsKey(key)){ //checks if the hashmap already has this key,initailly it doesnt have
                ansMap.put(key,new ArrayList());//create an empty list for this key
            }
            ansMap.get(key).add(s); //go to the key and add the string 's' to the lost
        }
        
        return new ArrayList(ansMap.values());//gives only the list and converts it to an Array List
    }
}