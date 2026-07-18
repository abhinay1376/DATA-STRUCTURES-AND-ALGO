class Solution {
    public static int nthTribonacci(int n) {
        // DP using Tabulation
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        int[] dp = new int[n+1]; // to store the evaluated i-th tribonacci number
        // Base cases :
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<n+1; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1]; // evaluate i-th tribonacci number
        }
        return dp[n]; // contains n-th tribonacci number
    }
}
