1class Solution {
2    public int trap(int[] nums) {
3        int n=nums.length;
4    int[] leftmax=new int[n];
5    int[] rightmax=new int[n];
6    leftmax[0]=nums[0];
7    for(int i=1;i<nums.length;i++){
8        leftmax[i]=Math.max(leftmax[i-1],nums[i]);
9    }
10    rightmax[n-1]=nums[n-1];
11      for(int i=n-2;i>=0;i--){
12        rightmax[i]=Math.max(rightmax[i+1],nums[i]);
13    }
14    int water=0;
15      for(int i=0;i<nums.length;i++){
16      water+=Math.min(leftmax[i],rightmax[i])-nums[i];
17      }
18      return water;
19        
20        
21    }
22
23}