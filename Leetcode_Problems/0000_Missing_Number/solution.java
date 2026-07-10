1class Solution {
2    public int missingNumber(int[] nums) {
3     int xor=0;
4     for(int i=0;i<nums.length;i++){
5        xor^=i+1;
6        xor^=nums[i];
7     }   
8     return xor;
9    }
10}