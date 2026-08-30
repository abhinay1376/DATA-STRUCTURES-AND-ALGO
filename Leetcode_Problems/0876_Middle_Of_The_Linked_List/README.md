# 0876. Middle of the Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/middle-of-the-linked-list/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n) - but extra loop  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
so counting the linked list length and then to print from the middle and make middle node as head node and returning temp

### Lines / Logic To Be Careful With
temp=head;
       count=(count/2)+1;
       for(int i=1;i<count;i++){
          temp=temp.next;
       }
       return temp;

### Edge Cases Handled
alllllllllllllllllllllllllll

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
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
       temp=head;
       count=(count/2)+1;
       for(int i=1;i<count;i++){
          temp=temp.next;
       }
       return temp;
    }
}
```
