1class Solution {
2    public int shipWithinDays(int[] nums, int days) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6        }
7        int max=0;
8        for(int i=0;i<nums.length;i++){
9            max=Math.max(nums[i],max);
10        }
11        int left=max;
12        int right=sum;
13        int mid=0;
14        int ans=-1;
15        while(left<=right){
16            mid=left+(right-left)/2;
17            if(poss(nums,mid,days)){
18            ans=mid;
19            right=mid-1;
20            }
21            else 
22            left=mid+1;
23        }
24        return ans;
25
26    }
27    public static boolean poss(int[] nums,int mid,int days)
28{
29    int sum11=0;
30    int count=1;
31    for(int i=0;i<nums.length;i++){
32        sum11+=nums[i];
33        if(sum11>mid)
34        {
35          count++;
36        sum11=nums[i];
37        }
38    }
39    if(count<=days) return true;
40    else 
41    return false;
42}}