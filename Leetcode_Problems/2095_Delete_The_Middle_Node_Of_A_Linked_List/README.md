# 2095. Delete the Middle Node of a Linked List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find middle
     ↓
Traverse again
     ↓
Find previous node
     ↓
Delete

### Lines / Logic To Be Careful With
while(temp!=null){
             if(temp.next==mid){
                temp.next=mid.next;
             }
             temp=temp.next;
        }
        return head;

### Edge Cases Handled
if(head==null||head.next==null) return null;

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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode mid=middle(head);
        ListNode temp=head;
        while(temp!=null){
             if(temp.next==mid){
                temp.next=mid.next;
             }
             temp=temp.next;
        }
        return head;

    }
    static ListNode middle(ListNode head){
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
