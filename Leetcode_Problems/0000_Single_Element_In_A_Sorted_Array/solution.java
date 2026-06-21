1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3     int left=0;
4     int n=nums.length;
5     int right=nums.length-1;
6     int ans=0;
7     int mid=-1;
8    if(n==1) return nums[0];
9     if(nums[0]!=nums[1]) return nums[0];
10     if(nums[n-1]!=nums[n-2]) return nums[n-1];
11     while(left<=right){
12        mid=(right+left)/2;
13        if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
14        ans= nums[mid];
15        break;
16        }
17        if(mid%2==0&&nums[mid]==nums[mid+1]){
18            left=mid+1;
19        }
20        else  if(mid%2!=0&&nums[mid]==nums[mid-1])
21           left=mid+1;
22           else 
23            right=mid-1;
24
25
26     }
27     return ans;
28    }
29}