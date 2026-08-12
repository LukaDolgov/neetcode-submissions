class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nset = set(nums)
        longest = 0
        for i in range(len(nums)):
            if nums[i] - 1 not in nset:
                length = 1
                current = nums[i]
                while current + 1 in nset:
                    current += 1
                    length += 1
                if length >= longest:
                    longest = length
        return longest
        
        return max(results)
                


