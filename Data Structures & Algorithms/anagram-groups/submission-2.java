class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for (String word : strs) {
            int[] count = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (hmap.containsKey(key)) {
                hmap.get(key).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                hmap.put(key, group);
            }
        }
        return new ArrayList<>(hmap.values());
    }

}
