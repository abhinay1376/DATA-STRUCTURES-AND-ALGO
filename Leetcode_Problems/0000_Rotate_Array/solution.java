1class Solution {
2    public void rotate(int[] nums, int k) {
3        k=k%nums.length;
4        reverse(nums,0,nums.length);
5        reverse(nums,0,k);
6        reverse(nums,k,nums.length);
7        
8    }
9    static void reverse(int[] nums,int start,int end){
10        int left=start;
11        int right=end-1;
12        while(left<right){
13            int temp=nums[left];
14            nums[left]=nums[right];
15            nums[right]=temp;
16            left++;
17            right--;
18        }
19    }
20    
21}