# Sum Of Digits

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/sum-of-digits1742/1)  
**Submission Date:** 7 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
sum of all the digits

### Lines / Logic To Be Careful With
noneeeeeeeeeeeeeeeeeeeee

### Edge Cases Handled
allllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}
```
