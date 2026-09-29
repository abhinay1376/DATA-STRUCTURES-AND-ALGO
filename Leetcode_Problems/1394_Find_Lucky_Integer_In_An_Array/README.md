# 1394. Find Lucky Integer in an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-lucky-integer-in-an-array/)  
**Submission Date:** 29 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
storing all the frequencies of each element in map and checking the largest lucky number

### Lines / Logic To Be Careful With
the order of value and frequency of elements in map

### Edge Cases Handled
allllllllllllllllllllll

## Solution

```java
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
      for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
int max=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==map.get(arr[i])){
        max=Math.max(max,arr[i]);
    }

}
return max;
    }
}
```
