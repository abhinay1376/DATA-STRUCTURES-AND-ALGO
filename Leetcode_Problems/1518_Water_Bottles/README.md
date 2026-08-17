# 1518. Water Bottles

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/water-bottles/)  
**Submission Date:** 17 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(log₁₀ n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Drink all available bottles, then repeatedly exchange the empty bottles for new bottles until you don't have enough empties to make another exchange.

### Lines / Logic To Be Careful With
numBottles=newBottle+numBottles % numExchange;

### Edge Cases Handled
alllllllllllllllllll

## Solution

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
               int ans=numBottles;
               while(numBottles>=numExchange){
                int newBottle= numBottles/numExchange;
                ans+=newBottle;
                numBottles=newBottle+numBottles % numExchange;
               }
               return ans;
    }
}
```
