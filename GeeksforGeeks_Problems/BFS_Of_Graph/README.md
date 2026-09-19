# BFS of Graph

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1)  
**Submission Date:** 19 Sept 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(V + E)  
**Space Complexity:** O(V)  

## Revision Notes

### Intuition
Queue
  ↓
Take node
  ↓
Process node
  ↓
Visit its unvisited neighbors
  ↓
Put neighbors into queue
  ↓
Repeat

### Lines / Logic To Be Careful With
inner for loop and also node

### Edge Cases Handled
all using the visited array

## Solution

```java
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> ans=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    q.add(0);
    boolean[] visited=new boolean[adj.size()];
    visited[0]=true;
    while(!q.isEmpty()){
        int node=q.poll();
        ans.add(node);
        for(int j=0;j<adj.get(node).size();j++){
            int i=adj.get(node).get(j);
            if(!visited[i]){
                q.add(i);
                visited[i]=true;
            }
        }
    }
    return ans;
    }
}
```
