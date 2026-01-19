class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> maps = new HashMap<>();

        for (String s : strs) {
            char[] tKey = s.toCharArray();
            Arrays.sort(tKey);
            String key = new String(tKey);

            if (!maps.containsKey(key)) {
                maps.put(key, new ArrayList<>());
            }

            maps.get(key).add(s);
        }

        return new ArrayList<>(maps.values());
    }
}