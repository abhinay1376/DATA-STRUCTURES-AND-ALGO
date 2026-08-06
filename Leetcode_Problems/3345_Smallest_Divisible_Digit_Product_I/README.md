# 3345. Smallest Divisible Digit Product I

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-divisible-digit-product-i/)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** Let d be the number of digits. If we check k numbers before finding the answer:  O(k × d)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Start checking from n.
Compute the product of all digits of the current number.
If the product is divisible by t, return that number.
Otherwise, increment the number and repeat.

### Lines / Logic To Be Careful With
while (n > 0) {
            product *= n % 10;
            n /= 10;
        }

### Edge Cases Handled
3 digit numbersssssssssssssssssss

## Solution

```java
class Solution {
    public int smallestNumber(int n, int t) {
        while(n!=0){
            if(check(n,t)){
                return n;
            }
            else 
            n++;
        }
      return 0;
    }
    static boolean check(int n,int t){
                int product = 1;

        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }

        return product % t == 0;

    }
}
```
