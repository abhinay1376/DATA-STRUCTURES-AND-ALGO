# Cycle Length in Linked List

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/find-length-of-loop/1)  
**Submission Date:** 2 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
we use slow pointer approach to find the loop exist or not if the loop exists then by taking the point where slow and fast are met and temp which is next node of slow and whenever it meets slow again we increment the count so we get the loop length

### Lines / Logic To Be Careful With
if(slow==fast){
               int count=1;
               Node temp=slow.next;
               while(temp!=slow){
                   temp=temp.next;
                   count++;
                  
               }
               return count;
               
           }

### Edge Cases Handled
alllllllllllllllllllll

## Solution

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        Node last=null;
        while(fast!=null&&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               int count=1;
               Node temp=slow.next;
               while(temp!=slow){
                   temp=temp.next;
                   count++;
                  
               }
               return count;
               
           }
        }
       
      
        return 0;
            }
    }
```
