# 0628. Maximum Product of Two Digits

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-of-two-digits/)  
**Submission Date:** 26 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
so we iterate through entire number and store the first and second max and return their product

### Lines / Logic To Be Careful With
using = in the while loops because same number can be repeated twice

### Edge Cases Handled
using = in the while loops because same number can be repeated twice

## Solution

```java
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
          int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
       
       
        while(n!=0){
            int digit=n%10;
            if(digit>=max){
                max1=max;
                max=digit;
            }
            else if(digit>=max1){
                max1=digit;
            }
            n/=10;
        }
      
        
         return max1*max;
    }
}
```
