/*
Problem Revision Notes

Problem:    Sort Colors
Platform:   LeetCode
Difficulty: Medium
Date:       2026-07-23

──────────────────────────────────────────────────

Intuition
dutch national flag algorithm

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
mid<=high  because everyelement needs to be check

──────────────────────────────────────────────────

Edge Cases Handled
allllllllllllllllllllllllllll

──────────────────────────────────────────────────

Mistakes I Made
nopeeeeeeeeeeeeeeeeeeeee

──────────────────────────────────────────────────

Future Reminder
only 0's and 2's are swapped not 1's

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(1)

══════════════════════════════════════════════════
*/

class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                mid++;
                left++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else mid++;
        }
    }
}