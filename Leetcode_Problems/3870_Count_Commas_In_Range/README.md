# 3870. Count Commas in Range

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-commas-in-range/)  
**Submission Date:** 8 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
The first comma appears at 1,000. Since n ≤ 100,000, every number that contains a comma has exactly one comma. Therefore, simply count the numbers from 1000 through n, which is n - 1000 + 1.

### Lines / Logic To Be Careful With
1000 itself must be included, hence the +1.
For n < 1000, return 0.
Math.abs() and digit counting are unnecessary here.

### Edge Cases Handled
1000 itself must be included, hence the +1.
For n < 1000, return 0.
Math.abs() and digit counting are unnecessary here.

## Solution

```java
class Solution {
    public int countCommas(int n) {
        int d=Math.abs(1000-n);
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        if(count<4) return 0;
        
        return d+1;
    }
}
```
