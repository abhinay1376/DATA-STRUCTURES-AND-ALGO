# 0121. Best Time to Buy and Sell Stock

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
**Submission Date:** 25 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
so first we check the right pointer value is less than left pointer value then the left becomes right because it is the good chance to buy the stock and we check the remaining elements after taht

### Lines / Logic To Be Careful With
left=right;;;;;;;;;;;;;;;;

### Edge Cases Handled
sorted arrays in the descending order are not the ones which gives the profit

## Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int count=0;
        for(int i=0;i<prices.length-1;i++){
         if(prices[i]>prices[i+1]){
            count++;
         }

        }
        if(count==prices.length-1){
        return 0;
        }
        int left=0;
        int max=0;
        int right=1;
        while(right<prices.length){
            if(prices[right]>prices[left]){
                max=Math.max(max,prices[right]-prices[left]);
                
            }
            else 
              left=right;
              right++;
        }
       return max;
    }
}
```
