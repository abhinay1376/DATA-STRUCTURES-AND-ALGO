1class Solution {
2    public String reverseWords(String s) {
3       s= s.trim();
4        String[] arr=s.split("\\s+");
5        StringBuilder sb=new StringBuilder();
6        for(int i=arr.length-1;i>=0;i--){
7            sb.append(arr[i]);
8            if(i!=0)
9            sb.append(' ');
10        }
11        return sb.toString();
12    }
13}