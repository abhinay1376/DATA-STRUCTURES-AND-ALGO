class Solution:
    def minTime(self, arr, k):
        def canPaint(maxTime):
            painters = 1
            curr = 0

            for board in arr:
                if curr + board <= maxTime:
                    curr += board
                else:
                    painters += 1
                    curr = board

            return painters <= k

        low = max(arr)
        high = sum(arr)
        ans = high

        while low <= high:
            mid = (low + high) // 2

            if canPaint(mid):
                ans = mid
                high = mid - 1
            else:
                low = mid + 1

        return ans
