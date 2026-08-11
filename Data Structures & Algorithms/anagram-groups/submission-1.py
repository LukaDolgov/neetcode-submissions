class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       output = {}
       for i in range(len(strs)):
            count = [0] * 26
            for j in range(len(strs[i])):
                index = ord(strs[i][j]) - ord('a')
                count[index] += 1
            key = tuple(count)
            if key not in output:
                output[key] = [strs[i]]
            else:
                output[key].append(strs[i])
       return list(output.values())