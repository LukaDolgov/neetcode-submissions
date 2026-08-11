class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        from collections import Counter
        cnt = Counter(nums)
        res = [[] for _ in range(len(nums) + 1) ]
        for num, freq in cnt.items():
            res[freq].append(num)
        oup = []
        for i in range(len(nums), 0, -1):
            for num in res[i]:
                oup.append(num)
            if len(oup) == k:
                return oup
        return oup

            