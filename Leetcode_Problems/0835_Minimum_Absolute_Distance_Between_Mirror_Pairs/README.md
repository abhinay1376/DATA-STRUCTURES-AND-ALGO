# 0835. Minimum Absolute Distance Between Mirror Pairs

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/)  
**Submission Date:** 13 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n × d) where d = number of digits; effectively O(n) for bounded integers.  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Store the reverse of each previous number along with its index.
When the current number exists in the map, it means some previous number is its mirror pair.
Use the latest matching index because it gives the smallest possible distance.
Keep updating the minimum distance and return -1 if no pair exists.

### Lines / Logic To Be Careful With
if(set.containsKey(nums[i])&&i!=set.get(nums[i])){
                ans=Math.abs(i-set.get(nums[i]));
                min=Math.min(ans,min);
            }
            set.put(rev(nums[i]),i);

### Edge Cases Handled
if(min==Integer.MAX_VALUE)
        return -1;

## Solution

```java
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> set=new HashMap<>();
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(set.containsKey(nums[i])&&i!=set.get(nums[i])){
                ans=Math.abs(i-set.get(nums[i]));
                min=Math.min(ans,min);
            }
            set.put(rev(nums[i]),i);
            
            
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;      
    }
    static int rev(int n){
        int rev=0;
        while(n!=0){
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
        return rev;
    }
}
```
