1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n=nums.length;
4        int left=1;
5        int right=n-2;
6        if(n==1) return 0;
7       if(nums[0]>nums[1]) return 0;
8     if(nums[n-2]<nums[n-1]) return n-1;
9    
10        
11        while(left<=right){
12            int mid=(right+left)/2;
13            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
14            
15                return mid;
16                
17            
18           else if(nums[mid]>nums[mid-1]){
19                left=mid+1;
20            }
21            else 
22                right=mid-1;
23
24        }
25        return 0;
26    }
27}