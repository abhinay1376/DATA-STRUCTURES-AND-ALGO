1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        int max=0;
5        int sum=0;
6        if(k>nums.length) return -1;
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9            max=Math.max(nums[i],max);
10        }
11                if(k==1) return sum;
12
13        int low=max;
14        int high=sum;
15        int mid=0;
16        int ans=0;
17        int ans1=0;
18       while(low<=high){
19           mid=(low+high)/2;
20          ans=nostudent(nums,mid);
21            if(ans>k){
22                low=mid+1;
23            }
24            else{
25            ans1=mid;
26             high=mid-1;
27            }
28           
29       }
30        return ans1;
31    }
32    static int nostudent(int[] nums,int pages){
33        int stu=1;
34        int stupag=0;
35        for(int i=0;i<nums.length;i++){
36            if(stupag+nums[i]<=pages){
37                stupag+=nums[i];
38            }
39            else{
40                stu++;
41                stupag=nums[i];
42            }
43        }
44        return stu;
45    }
46}
47