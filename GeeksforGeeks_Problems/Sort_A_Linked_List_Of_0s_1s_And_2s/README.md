# Sort a linked list of 0s, 1s and 2s

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1)  
**Submission Date:** 3 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Create separate chains for 0, 1, and 2.
A chain may be empty, so we cannot blindly connect 0 → 1 → 2.
If 1 exists: 0 → 1 → 2.
If 1 doesn't exist: 0 → 2.
two.next = null ensures the final list terminates properly.

### Lines / Logic To Be Careful With
Node zeroDummy=new Node(-1);
        Node oneDummy=new Node(-1);
        Node twoDummy=new Node(-1);
        Node zero=zeroDummy;
        Node ones=oneDummy;
        Node twos=twoDummy;
        Node temp=head;

### Edge Cases Handled
zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;

## Solution

```java
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        Node zeroDummy=new Node(-1);
        Node oneDummy=new Node(-1);
        Node twoDummy=new Node(-1);
        Node zero=zeroDummy;
        Node ones=oneDummy;
        Node twos=twoDummy;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                   ones.next=temp;
                ones=ones.next;
            
            }
            else{
                   twos.next=temp;
                twos=twos.next;
            
            }
            temp=temp.next;
        }
        zero.next=(oneDummy.next!=null)?oneDummy.next:twoDummy.next;
        ones.next=twoDummy.next;
        twos.next=null;
        return zeroDummy.next;
        
    }
}
```
