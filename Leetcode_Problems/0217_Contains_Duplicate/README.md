# 0217. Contains Duplicate

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/contains-duplicate/)  
**Submission Date:** 7 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
nstead of comparing every number with every other number, store the frequency of numbers seen so far. The moment a number appears for the second time, we immediately know a duplicate exists. Early return avoids unnecessary iterations.

### Lines / Logic To Be Careful With
map.get(num) > 1 must come after updating the frequency

### Edge Cases Handled
Empty array, single element, duplicates appearing anywhere in the array.

## Solution

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>1)
            return true;
        }
        return false;
    }
}
```
