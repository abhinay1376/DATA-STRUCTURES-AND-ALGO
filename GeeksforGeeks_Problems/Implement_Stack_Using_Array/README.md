# Implement Stack using Array

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/implement-stack-using-array/1)  
**Submission Date:** 8 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
top always stores the index of the current top element. Initially it is -1, meaning the stack is empty. During push, increment top and insert the element; during pop, simply decrement top. The array keeps the elements, while top controls which element is currently accessible.

### Lines / Logic To Be Careful With
int[] arr; int top; int n;

    public myStack(int n) {
        // Define Data Structures
        this.n = n; this.arr = new int[n]; this.top = -1;

### Edge Cases Handled
// Returns the top element of the stack
        if(!isEmpty())
        return arr[top];
        return -1;

## Solution

```java
class myStack {
    int[] arr; int top; int n;

    public myStack(int n) {
        // Define Data Structures
        this.n = n; this.arr = new int[n]; this.top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top==n-1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(top!=n-1){
            arr[++top]=x;
        }

    }

    public void pop() {
        // Removes an element from the top of the stack
        if(top!=-1){
            top--;
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if(!isEmpty())
        return arr[top];
        return -1;
    }
}
```
