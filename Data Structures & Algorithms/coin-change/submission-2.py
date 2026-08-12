class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        res = [float("inf")] * (amount + 1)
        res[0] = 0 
        for curr in range(1, amount + 1):
            for coin in coins:
                if curr - coin >= 0:
                    res[curr] = min(
                        res[curr],
                        1 + res[curr - coin]
                    )
        answer = res[-1]
        return -1 if answer == float("inf") else answer