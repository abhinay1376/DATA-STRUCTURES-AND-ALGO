1class Solution {
2    public int search(int[] nums, int target) {
3          int left=0;
4          int n=nums.length;
5          int right=n-1;
6          while(left<=right){
7            int mid=(right+left)/2;
8            if(nums[mid]==target) return mid;
9            if(nums[left]<=nums[mid]){
10                if(nums[left]<=target&&target<=nums[mid])
11                right=mid-1;
12                else 
13                left=mid+1;
14            }
15            else{
16                if(nums[mid]<=target&&target<=nums[right])
17                left=mid+1;
18                else
19                right=mid-1;
20            }
21          }
22          return -1;
23    }
24}