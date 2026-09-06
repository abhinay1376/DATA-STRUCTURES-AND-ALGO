# 1518. Water Bottles

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/water-bottles/)  
**Submission Date:** 6 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(nlogn)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Drink all full bottles and add them to your empty bottles. Use groups of numExchange empty bottles to get new full bottles. Repeat until no full bottles can be obtained.

### Lines / Logic To Be Careful With
numExchange remains constant in LeetCode 1518.
Your original code correctly exchanges one bottle at a time.
Constraints guarantee numExchange >= 2, preventing an infinite exchange cycle.

### Edge Cases Handled
allllllllllllllllllllll

## Solution

```java
int numWaterBottles(int numBottles, int numExchange) {
    int remaining=0;
    int ans=0;
    
     while(1){
         ans+=numBottles;
         remaining+=numBottles;
         numBottles=0;
         if(remaining>=numExchange){
              remaining=remaining-numExchange; 
              numBottles+=1;
         }
         else 
          return ans;

     }
     return 0;
}
```
