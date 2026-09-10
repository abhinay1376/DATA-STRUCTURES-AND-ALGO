# 0875. Find Numbers with Even Number of Digits

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)  
**Submission Date:** 10 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n × d)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Intuition summary

Dividing a positive integer by 10 removes its last digit. Therefore, the number of divisions required to reach 0 equals the number of digits. For every array element, count its digits and check whether that count is divisible by 2.

### Lines / Logic To Be Careful With
while(n!=0) then we need to return 1 instead of 1 as 0 has 1 digit

### Edge Cases Handled
0 has 1 digit, not 0.
The helper modifies n, which is fine because it is a local copy.
% 2 == 0 correctly checks for an even number of digits.

## Solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digit=dig(nums[i]);
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
    static int dig(int n){
        int count=0;
       while(n!=0){
         count++;
         n/=10;
       }
       return count;
    }
}
```
