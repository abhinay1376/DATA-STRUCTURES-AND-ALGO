# 0048. M[i,j] --> M'[j,N-1-i]

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/rotate-image/)  
**Submission Date:** 24 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
A clockwise rotation can be broken into two easy operations:

1. Transpose

Swap:

matrix[i][j] ↔ matrix[j][i]

This flips the matrix across its main diagonal.

2. Reverse each row

After transpose, the elements are almost in the rotated position. Reversing every row completes the 90° clockwise rotation.

### Lines / Logic To Be Careful With
when i!=j transpose of matrix

### Edge Cases Handled
allllllllllllllllllllll

## Solution

```java
class Solution {
    public void rotate(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                if(i!=j){
                    int temp=nums[i][j];
                    nums[i][j]=nums[j][i];
                    nums[j][i]=temp;
                }
            }
        }
         for(int i=0;i<m;i++){
                reverse(nums[i],0,n);
            }
        }



    
    static void reverse(int nums[],int start,int end){
        int left=start;
        int right=end-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
                        left++;
right--;

        }
    }
}
```
