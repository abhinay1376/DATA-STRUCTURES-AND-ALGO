class Solution:
    def power(self, mid, n, m):
        res = 1
        for _ in range(n):
            res *= mid
            if res > m:
                return 2
        return 1 if res == m else 0
        
    def nthRoot(self, n, m):
       # code here
        l, r = 0, m
        
        while l <= r:
            mid = l + (r-l)//2
            val = self.power(mid, n, m)
            
            if val == 1:
                return mid
            if val == 2:
                r = mid - 1
            else:
                l = mid + 1
                
        return -1