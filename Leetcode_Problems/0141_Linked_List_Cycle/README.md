# 0141. Linked List Cycle

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
"Have I encountered this exact node object before?"

That's exactly what a cycle means.

For example:

1 → 2 → 3
    ↑   |
    └───┘

When we reach node 2 again:

set.contains(temp)

becomes true.

### Lines / Logic To Be Careful With
if(set.contains(temp)) return true;
            set.add(temp);

### Edge Cases Handled
we are not storing elements data we are storing the address

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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp)) return true;
            set.add(temp);
            temp=temp.next;
            
        }
        return false;
    } 
}
```
