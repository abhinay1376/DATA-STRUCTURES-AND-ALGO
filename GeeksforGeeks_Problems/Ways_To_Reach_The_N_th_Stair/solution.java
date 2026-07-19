/*
Problem Revision Notes

Problem:    Ways to Reach the n'th Stair
Platform:   GeeksForGeeks
Date:       2026-07-19

──────────────────────────────────────────────────

Intuition
climbing stairs using the memoization

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
returning which function and the parameters in it should be careful

──────────────────────────────────────────────────

Edge Cases Handled
base condition in the function

──────────────────────────────────────────────────

Mistakes I Made
not returning in the main function

──────────────────────────────────────────────────

Future Reminder
the dp array should be filled with -1 and after that we will assign the array elements using the recursion

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(n)

══════════════════════════════════════════════════
*/

class Solution {
    
    int countWays(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    
    int solve(int n, int[] dp) {
        // Base cases
        if (n == 0) return 1;
        if (n < 0) return 0;
        
        // If already computed
        if (dp[n] != -1) return dp[n];
        
        // Recursive relation
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        
        return dp[n];
    }
}
