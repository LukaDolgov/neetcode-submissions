class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            hmap.put(curr, hmap.getOrDefault(curr, 0) + 1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );
        for (int key : hmap.keySet()) {
            heap.offer(new int[]{key, hmap.get(key)});
        }
        while (heap.size() > k) {
            heap.poll();
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int[] pair = heap.poll();
            result[i] = pair[0];
        }
        return result;
    }
}
