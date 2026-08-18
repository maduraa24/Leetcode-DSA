class Solution {
    public boolean containsDuplicate(int[] nums) {
      //create a HashSet to store elements from the array
        HashSet<Integer> hash=new HashSet<>();
      
      //Iterate through each element in the array
        for(int num:nums){
          //check if the element is already in the HashSet
          if(hash.contains(num)){
            return true; //duplicate found
          }
          //add elements to the HashSet if no duplicate is found
          hash.add(num);
        }
        //if we iterate through the entire array and find no duplicate,then retun false. 
        return false;
    }
}