class Solution {
  public:
    int longestConsecutive(vector<int>& arr) {
        // code here
        int n = arr.size();
        vector<int> a(1e5+2, 0);
        for(auto x : arr) a[x] = 1;
        int ans = 0;
        int i = 0;
        while(i <= 1e5){
            int j = i;
            while(j <= 1e5 and a[i] and a[i] == a[j]) j++;
            ans = max(ans, j - i);
            i = j + 1;
        }
        return ans;
    }
};