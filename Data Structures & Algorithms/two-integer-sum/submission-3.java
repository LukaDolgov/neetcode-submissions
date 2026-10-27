class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int comp = target - curr;
            if (hmap.containsKey(comp)) {
                return new int[]{hmap.get(comp), i};
            } else {
                hmap.put(curr, i);
            }
        }
        return new int[]{};
    }
}
