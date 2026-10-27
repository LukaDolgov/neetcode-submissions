class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            hmap.put(curr, hmap.getOrDefault(curr, 0) + 1);
        }
        for (int x : hmap.keySet()) {
            if (hmap.get(x) > 1) {
                return true;
            }
        }
        return false;
    }
}