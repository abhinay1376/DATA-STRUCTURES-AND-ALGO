# 2472. Two Furthest Houses With Different Colors

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/two-furthest-houses-with-different-colors/)  
**Submission Date:** 15 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Maximum distance means we want the widest possible gap between two different values.
Therefore, one endpoint should ideally be index 0 or n-1.
Find the first element different from nums[0], or the last element different from nums[0].
Whichever gives the larger distance is the answer.

### Lines / Logic To Be Careful With
j != 0 is a bug; use j >= 0.
Don't use Math.abs(i-j) when you can reason about which endpoint gives maximum distance.
Check the extreme indices first — maximum/minimum problems often have an endpoint observation.
If all elements are equal, answer is 0.

### Edge Cases Handled
And this is another good example of your current progress: your brute-force thinking is fine. The next level you're developing now is asking, "Do I really need to check every pair?" That's the optimization instinct you want.

## Solution

```java
class Solution {
    public int maxDistance(int[] nums) {
        if(nums.length==1) return 0;
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
        for(int j=nums.length-1;j!=0;j--){
            if(nums[i]!=nums[j]){
                ans=Math.abs(i-j);
                max=Math.max(max,ans);
            }
        }
        }
        return max;
    }
}
```
