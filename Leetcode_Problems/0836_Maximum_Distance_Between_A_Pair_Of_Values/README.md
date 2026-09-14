# 0836. Maximum Distance Between a Pair of Values

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/)  
**Submission Date:** 14 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log m)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
For every i in nums1, we need the largest possible j in nums2 such that nums1[i] <= nums2[j].
Because nums2 is non-increasing, once nums2[mid] >= nums1[i], we can search further right.
If nums2[mid] < nums1[i], we must move left.
Taking the maximum j-i across all i gives the answer.

### Lines / Logic To Be Careful With
initialising left with i

### Edge Cases Handled
allllllllllllllllllllllllllllllll

## Solution

```java
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
          int left=i;
          int right=nums2.length-1;
        while(left<=right){
            int mid=right+(left-right)/2;
            if(nums2[mid]>=nums1[i]&&mid>=i){
            
                 int ans=mid-i;
                max=Math.max(ans,max);
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
```
