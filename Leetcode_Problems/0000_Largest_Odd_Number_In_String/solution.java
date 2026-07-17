1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i=num.length()-1;i>=0;i--){
4            int digit=num.charAt(i)-'0';
5            if(digit%2!=0){
6                return num.substring(0,i+1);
7            }
8        }
9        return "";
10    }
11}