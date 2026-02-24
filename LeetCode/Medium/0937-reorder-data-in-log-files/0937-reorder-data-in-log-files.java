class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> numList = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            String[] word = logs[i].split(" ", 2);
            if (Character.isDigit(word[1].charAt(0))) {
                numList.add(logs[i]);
            } else letterList.add(logs[i]);
        }

        letterList.sort((s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            int compare = split1[1].compareTo(split2[1]);

            if (compare == 0) {
                return split1[0].compareTo(split2[0]);
            }

            return compare;
        });
        
        letterList.addAll(numList);

        return letterList.toArray(new String[0]);
    }
}