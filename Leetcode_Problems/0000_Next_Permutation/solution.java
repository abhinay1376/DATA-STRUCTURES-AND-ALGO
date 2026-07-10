1class Solution {
2    public void nextPermutation(int[] nums) {
3        int breakpoint=-1;
4        for(int i=nums.length-1;i>0;i--){
5            if(nums[i]>nums[i-1]){
6                breakpoint=i-1;
7                break;
8            }
9        }
10         if(breakpoint==-1) reverse(nums,0,nums.length);
11         else{
12          for(int i=nums.length-1;i>breakpoint;i--){
13            if(nums[i]>nums[breakpoint]){
14             int temp=nums[i];
15             nums[i]=nums[breakpoint];
16             nums[breakpoint]=temp;
17             break;
18            }
19        }
20                     reverse(nums,breakpoint+1,nums.length);
21
22         }
23       
24    }
25    static void reverse(int[] nums,int start,int end){
26        int left=start;
27        int right=end-1;
28        while(left<(right))
29        {
30          int temp=nums[left];
31          nums[left]=nums[right];
32          nums[right]=temp;
33          left++;
34          right--;
35        }
36    }
37}