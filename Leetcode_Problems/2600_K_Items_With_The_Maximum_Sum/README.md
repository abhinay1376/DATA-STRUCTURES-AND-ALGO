# 2600. K Items With the Maximum Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/k-items-with-the-maximum-sum/)  
**Submission Date:** 23 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
basic approach checking

### Lines / Logic To Be Careful With
return numOnes>=k?k:numOnes+numZeros>=k?numOnes:numOnes-(k-(numOnes+numZeros));

### Edge Cases Handled
allllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return numOnes>=k?k:numOnes+numZeros>=k?numOnes:numOnes-(k-(numOnes+numZeros));
    }
}
```
