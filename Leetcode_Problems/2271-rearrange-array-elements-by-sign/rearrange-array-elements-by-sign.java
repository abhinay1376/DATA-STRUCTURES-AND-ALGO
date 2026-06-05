class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left=0;
        int right=1;
        int[] arr=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            arr[left]=nums[i];
            left=left+2;
        }
        if(nums[i]<0) {
                   arr[right]=nums[i];
            right=right+2;
        }

       }
       return arr;
     } 
}
    
