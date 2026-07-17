1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb=new StringBuilder();
4        int depth=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='('){
8                if(depth>0)
9                sb.append('(');
10                depth++;
11            }
12            else{
13                depth--;
14                if(depth>0){
15                    sb.append(')');
16                }
17        }
18        }
19                return sb.toString();
20
21        }
22    }
23