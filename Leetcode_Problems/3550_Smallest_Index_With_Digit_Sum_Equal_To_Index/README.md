# 3550. Smallest Index With Digit Sum Equal to Index

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/)  
**Submission Date:** 24 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n × d) where d = number of digits in a number.  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Traverse the array and treat the index i as the candidate answer.
Calculate the digit sum of nums[i].
If digitSum == i, immediately return that index.
If no index satisfies it, return -1.

### Lines / Logic To Be Careful With
s(nums[i]) == i → compare digit sum, not the number itself.
Return immediately because we need the smallest index.

### Edge Cases Handled
If no match exists → return -1.
while(n != 0) correctly handles normal positive inputs.

## Solution

```java
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(s(nums[i])==i)
            return i;
        }
        return -1;
    }
    static int s(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
            
        }
        return sum;
    }
}
```
