1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] arr=new int[2];
4        int left=0;
5        int right=nums.length-1;
6        
7        while(left<=right){
8            int sum=nums[left]+nums[right];
9            if(sum==target){
10                arr[0]=left+1;
11                arr[1]=right+1;
12                return arr;
13            }
14            if(sum>target)
15            right--;
16            else 
17            left++;
18
19        }
20        return arr;
21    }
22}