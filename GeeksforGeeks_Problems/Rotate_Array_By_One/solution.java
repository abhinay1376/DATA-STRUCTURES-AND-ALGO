class Solution {
    public void rotate(int[] nums) {
        int k=1;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
        
    }
    static void reverse(int[] nums,int start,int end){
        int left=start;
        int right=end-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    
}