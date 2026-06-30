1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans=new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5                   List<Integer> temp=new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==0||j==i) 
8                temp.add(1);
9                else{
10                   int  val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
11                    temp.add(val);
12                }
13            }
14            ans.add(new ArrayList(temp));
15        }
16        return ans;
17        
18    }
19}