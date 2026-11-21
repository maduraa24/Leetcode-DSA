class Solution {
    public void sortColors(int[] nums) {
        int start=0,mid=0,end=nums.length-1;
        // int mid=0;
        // int end=nums.length-1;

        while(mid<=end){
            switch (nums[mid]){
                case 0:
                //swap with start index
                swap(nums,start,mid);
                mid++;
                start++;
                break;

                case 1:
                mid++;
                break;

                case 2:
                //swap with end index
                swap(nums,mid,end);
                end--;
                break;
            }
        }
    }
    public void swap(int[] arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
}
