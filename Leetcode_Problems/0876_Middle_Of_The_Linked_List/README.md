# 0876. Middle of the Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/middle-of-the-linked-list/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
think of train A and train B and both have to travel 1000km and A is moving at speed 100 and B at 50kmph so when A reaches 1000km the B will reach 500km which means exact middle

### Lines / Logic To Be Careful With
while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

### Edge Cases Handled
the n/2+1 so while condition is different and if we want to print the n/2 onwards for even length list then the while condition may change

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       return slow;
    }
}
```
