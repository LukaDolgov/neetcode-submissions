class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> tset = new HashSet<>();
        for (int num : nums) {
            tset.add(num);
        }
        if (tset.size() == 0) {
            return 0;
        }
        int bestseq = 1;
        for (int num : tset) {
            if (!tset.contains(num - 1)) {
                int curseq = 1;
                int curr = num;
                while (tset.contains(curr + 1)) {
                    curseq++;
                    curr++;
                }
                bestseq = Math.max(curseq, bestseq);
            }
        }
        return bestseq;
    }
}
