# 0237. Delete Node in a Linked List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/delete-node-in-a-linked-list/)  
**Submission Date:** 3 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** 0(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Since we are not given the head of the linked list, we cannot find the previous node to remove the current node in the usual way. Instead:

Copy the value of the next node into the current node.
Skip the next node by updating the next pointer.

This makes the current node look like the next node, and the original next node is effectively removed from the list.

### Lines / Logic To Be Careful With
allllllllllllllllllll

### Edge Cases Handled
alllllllllllllllllll

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *     }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
```
