class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        res = [-1] * len(cost)
        def recurse(i):
            if i < 0:
                return 0
            if res[i] != -1:
                return res[i]
            res[i] = cost[i] + min(recurse(i - 1), recurse(i - 2))
            return res[i]
        return min(recurse(len(cost) - 1), recurse(len(cost) - 2))