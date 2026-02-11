class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");

        String[] words = paragraph.split("\\s+");

        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        String result = "";

        for (String w : words) {
            if (w.isEmpty() || set.contains(w)) continue;

            int count = map.getOrDefault(w, 0) + 1;
            map.put(w, count);

            if (count > max) {
                max = count;
                result = w;
            }
        }
        
        return result;
    }
}