1class Solution {
2    public int minEatingSpeed(int[] nums, int h) {
3        int max=Integer.MIN_VALUE;
4        for(int i=0;i<nums.length;i++){
5            max=Math.max(max,nums[i]);
6        }
7        int ans1=-1;
8        int ans=0;
9        int left=1;
10        int right=max;
11        int mid=0;
12        while(left<=right){
13            mid=(right+left)/2;
14            ans1=speed(nums,mid,h);
15            if(ans1<=h){
16            ans=mid;
17            right=mid-1;
18            }
19            else if(ans1>h)
20            left=mid+1;
21           
22        }
23        return ans;
24    }
25    public static int speed(int[] nums,int mid,int h){
26        int sp=0;
27        for(int i=0;i<nums.length;i++){
28          sp+=Math.ceil((double)nums[i]/(double)mid);
29        }
30        return sp;
31    }
32}