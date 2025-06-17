class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            String target = babbling[i];
            for(int j = 0; j < words.length; j++){
                target = target.replace(words[j], " ");
            }
            if(target.isBlank()) answer++;
        }
        return answer;
    }
}