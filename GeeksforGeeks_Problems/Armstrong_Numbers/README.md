# Armstrong Numbers

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** 0(d) where d is no of digits  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
cubing each digit and adding it to sum and if it is equal to given number then it is a armstrong number

### Lines / Logic To Be Careful With
int k=n; because after that digit extraction the n becomes 0 at end

### Edge Cases Handled
alllllllllllllllllllllllllll

## Solution

```java
class Solution {
    static boolean armstrongNumber(int n) {
        int k=n;
        int sum=0;
       while(n!=0){
           int digit=n%10;
           sum+=digit*digit*digit;
           n/=10;
       }
       if(sum==k){
           return true;
       }
       return false;
    }
}
```
