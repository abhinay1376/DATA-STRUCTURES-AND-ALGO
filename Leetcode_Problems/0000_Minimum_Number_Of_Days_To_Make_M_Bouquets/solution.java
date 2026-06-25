1class Solution {
2    public int minDays(int[] nums, int m, int k) {
3        int max=0;
4         int min=Integer.MAX_VALUE;
5    
6     
7        int mid=0;
8        int ans=0;
9        if(nums.length<(long)m*k) return -1;
10        for(int i=0;i<nums.length;i++){
11           if(nums[i]>max)
12           max=nums[i];
13           max=Math.max(nums[i],max);
14        }
15          for(int i=0;i<nums.length;i++){
16           if(nums[i]<min)
17           min=nums[i];
18           min=Math.min(nums[i],min);
19        }
20            int right=max;
21        int left=min;
22        int ans1=Integer.MAX_VALUE;
23       while(left<=right){
24        mid=left+(right-left)/2;
25            if((bloom(nums,mid,m,k))==true){
26            ans1=Math.min(ans1,mid);
27            right=mid-1;
28            }
29           else 
30           left=mid+1;
31           
32            
33
34       }
35        return ans1;
36    }
37    public static boolean bloom(int[] nums,int mid,int m,int k){
38           int count=0;
39        int countf=0;
40        for(int i=0;i<nums.length;i++){
41            if(mid>=nums[i]){
42                count++;
43            }
44            else {
45            countf=countf+(count/k);
46            count =0;
47
48        }
49    }
50      countf=countf+(count/k);
51     if(countf>=m) return true;
52     else 
53     return false;
54}
55}