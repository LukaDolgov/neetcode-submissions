class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        i = 0
        j = len(numbers) - 1
        solved = False
        while not solved:
            tsum = numbers[i] + numbers[j]
            if tsum > target:
                j -= 1
            elif tsum < target:
                i += 1
            else:
                return[i + 1, j + 1]

        