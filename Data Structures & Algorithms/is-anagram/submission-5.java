class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hmap = new HashMap<>();
        Map<Character, Integer> hmap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            hmap2.put(c, hmap2.getOrDefault(c, 0) + 1);
        }
        return hmap.equals(hmap2);
    }
}
