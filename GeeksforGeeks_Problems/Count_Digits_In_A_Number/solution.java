class Solution {
  public:
    int countDigits(int n) {
        // Code here
        int temp_n=n;
        int digitCount=0;
        while(temp_n>0){
            temp_n=temp_n/10;
            digitCount++;
        }
        return digitCount;
    }
};