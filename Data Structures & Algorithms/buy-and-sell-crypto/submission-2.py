class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprof = 0
        i = 0
        j = 1
        while i < len(prices) and j < len(prices):
            prof = prices[j] - prices[i]
            if prof >= maxprof:
                maxprof = prof
            if prices[j] >= prices[i]:
                j += 1
            elif prices[j] < prices[i]:
                i = j
                j += 1
        return maxprof
