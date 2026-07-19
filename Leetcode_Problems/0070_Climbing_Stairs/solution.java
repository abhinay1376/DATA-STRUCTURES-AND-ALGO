1class Solution {
2    public int climbStairs(int n) {
3        if(n<=1) return 1;
4     int dp[]=new int[n+1];
5     Arrays.fill(dp,-1);
6     return steps(n,dp);
7    }
8    static int steps(int n,int[] dp){
9        dp[0]=1;
10        dp[1]=1;
11       for(int i=2;i<=n;i++){
12        dp[i]=dp[i-1]+dp[i-2];
13       }
14        return dp[n];
15    }
16}