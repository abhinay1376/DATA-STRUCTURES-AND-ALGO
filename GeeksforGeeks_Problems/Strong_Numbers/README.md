# Strong Numbers

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/strong-numbers4336/1)  
**Submission Date:** 7 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** 0(d)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Extract each digit one by one.

For every digit:

Find its factorial.
Add it to a running sum.

After processing all digits, compare the sum with the original number.

If they're equal, the number is a Strong Number.

### Lines / Logic To Be Careful With
storing the original number somewhere

### Edge Cases Handled
allllllllllllllllllllll

## Solution

```java
class Solution {
    public boolean isStrong(int n) {
         
        int k=n;
        int fac=0;
        while(n!=0){
            int digit=n%10;
      
       fac+=fact(digit);
            n/=10;
        }
        return fac==k;
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
```
