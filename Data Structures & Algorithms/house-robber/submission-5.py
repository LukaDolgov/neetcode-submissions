class Solution:
    def rob(self, nums: List[int]) -> int:
        res = [-1] * len(nums)
        def recurse(i):
            if i < 0:
                return 0
            elif res[i] != -1:
                return res[i]
            res[i] = max(recurse(i - 2) + nums[i], recurse(i - 1))
            return res[i]



        return max(recurse(len(nums) - 1), recurse(len(nums) - 2))