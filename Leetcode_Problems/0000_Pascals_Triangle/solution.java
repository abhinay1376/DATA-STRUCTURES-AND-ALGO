1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5            List<Integer> temp = new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j == 0 || j == i) temp.add(1);
8                else{
9                    int val = ans.get(i-1).get(j-1)+ ans.get(i-1).get(j);
10                    temp.add(val);
11                }
12            }
13            ans.add(new ArrayList<>(temp));
14        }
15        return ans;
16    }
17}
18