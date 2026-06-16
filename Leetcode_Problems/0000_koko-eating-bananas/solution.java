1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low=1;
4        int high=Integer.MIN_VALUE;
5        for(int i=0;i<piles.length;i++){
6            high=Math.max(piles[i],high);
7        }
8        while(low<=high){
9            int mid=low+(high-low)/2;
10            int ans=cal(mid,piles);
11            if(ans<=h){
12                high=mid-1;
13            }else{
14                low=mid+1;
15            }
16        }
17        return low;
18    }
19    public static int cal(int mid,int[] piles){
20        int total=0;
21        for(int i=0;i<piles.length;i++){
22            total+=Math.ceil((double)piles[i]/mid);
23        }
24        return total;
25    }
26}