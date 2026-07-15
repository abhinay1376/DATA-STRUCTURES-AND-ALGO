1class Solution {
2public String removeOuterParentheses(String S) {
3    StringBuilder s = new StringBuilder();
4    int opened = 0;
5    for (char c : S.toCharArray()) {
6        if (c == '(' && opened++ > 0) {
7            s.append(c);
8        }
9        if (c == ')' && opened-- > 1) {
10            s.append(c);
11        }
12    }
13    return s.toString();
14}
15}