class Solution {
  public:
    int findKRotation(vector<int> &arr) {
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i+1]<arr[i]) return i+1;
        }
        return 0;
        
    }
};