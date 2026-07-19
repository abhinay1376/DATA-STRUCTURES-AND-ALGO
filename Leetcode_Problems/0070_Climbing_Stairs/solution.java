/*
Problem Revision Notes

Problem:    Climbing Stairs
Platform:   LeetCode
Difficulty: Easy
Date:       2026-07-19

──────────────────────────────────────────────────

Intuition
its dp tabulation done after the memoization

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
checking the base condition in main function

──────────────────────────────────────────────────

Edge Cases Handled
base condition will handle the edge cases

──────────────────────────────────────────────────

Mistakes I Made
used n variable in the dp  for loop instead of the i variable

──────────────────────────────────────────────────

Future Reminder
storing the all the values in  a dp array and just returning them

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(n)

══════════════════════════════════════════════════
*/

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