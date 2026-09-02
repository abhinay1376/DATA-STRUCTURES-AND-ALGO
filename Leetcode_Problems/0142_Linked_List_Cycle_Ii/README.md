# 0142. Linked List Cycle II

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle-ii/)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
using hashset adding ALL the elements of the LL and if it repeats again that's where  a looop begins so we return it

### Lines / Logic To Be Careful With
HashSet<ListNode> and temp=temp.next

### Edge Cases Handled
alllllllllllllllllllllllll

## Solution

```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> set=new HashSet<>();
    ListNode temp=head;
      while(temp!=null){
         if(set.contains(temp))
         return temp;
         else{
            set.add(temp);
            temp=temp.next;
         }
      }
      return null;
    }
}
```
