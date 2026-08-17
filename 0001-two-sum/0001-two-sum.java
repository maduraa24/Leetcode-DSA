class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map <Integer,Integer> map=new HashMap<>();

    for(int i=0;i<nums.length;i++){

      //subtracting target and nums[i]
      int remainder=target-nums[i];

      //checking if the remainder is alreday in the hashmap
      if(map.containsKey(remainder)){
        //if it is present,return the index of the remainder and the current number
        return new int[]{map.get(remainder),i};
      }
      //else add the current number and its index to the hashmap
      map.put(nums[i],i);
    } 
    //return an empty array if no solution is found(this case won't occur as per the problem constraint)
    return new int[] {};   
  }
}