class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hash= new HashSet<> (); //initilizing an hashset
            //for(int i=0;i<nums.length;i++)
            for(int num:nums){
                if(hash.contains(num)){
                    return true;
                }
                hash.add(num);
            }
            return false;
    }
}
