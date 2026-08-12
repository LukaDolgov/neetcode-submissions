class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        numsl = [0] * len(nums)
        numsr = [0] * len(nums) 
        curr = 1
        for i in range(len(nums)): 
            numsl[i] = curr
            curr *= nums[i]
        curr = 1
        for i in range(len(nums) - 1, -1, -1):
            numsr[i] = curr
            curr *= nums[i]
        res = [0] * len(nums)
        for i in range(len(nums)):
            res[i] = numsl[i] * numsr[i]
        return res 