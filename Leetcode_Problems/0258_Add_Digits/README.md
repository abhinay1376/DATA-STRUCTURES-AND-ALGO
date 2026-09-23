# 0258. Add Digits

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/add-digits/)  
**Submission Date:** 23 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(log num)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Keep extracting digits using % 10 and adding them.
Replace num with the digit sum.
Repeat until only one digit remains.
This directly follows the problem requirement.

### Lines / Logic To Be Careful With
while(num >= 10) → stops when num becomes a single digit.
n % 10 → gets the last digit.
n /= 10 → removes the last digit.
num = 0 is handled correctly → returns 0.

### Edge Cases Handled
alllllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int addDigits(int num) {
        while(num>=10){
        num=sum1(num);
         }
    return num;
    }
    static int sum1(int n){
        int s=0;
        while(n!=0){
          s+=n%10;
          n/=10;
        }
        return s;
    }
}
```
