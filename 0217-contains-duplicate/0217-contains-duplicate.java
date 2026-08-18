class Solution {
    public boolean containsDuplicate(int[] nums) {
      //create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers=new HashSet<>();
      //Iterate through each element in the array
        for(int num:nums){
          //check if the element is alreday in the HashSet
          if(seenNumbers.contains(num)){
            return true; //duplicate found
          }
          //add elements to the HashSet if no duplicate is found
          seenNumbers.add(num);
        }
        return false;
    }
}