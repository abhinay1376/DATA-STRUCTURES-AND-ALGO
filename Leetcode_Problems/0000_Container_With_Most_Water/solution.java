1class Solution {
2    public int maxArea(int[] nums) {
3        int area=0;
4        int left=0;
5        int right=nums.length-1;
6        int max_area=0;
7        while(left<=right){
8            int min=Math.min(nums[left],nums[right]);
9            area=min*(right-left);
10            max_area=Math.max(max_area,area);
11            if(nums[right]>nums[left])
12            left++;
13            else 
14            right--;
15        }
16
17        return max_area;
18    }
19}