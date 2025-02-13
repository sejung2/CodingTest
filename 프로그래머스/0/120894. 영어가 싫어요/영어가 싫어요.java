import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> numlist = new HashMap<>();
        for(int i = 0; i < num.length; i++){
            numlist.put(num[i], i);
        }
        
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < numbers.length(); i++){
            word.append(numbers.charAt(i));
            if(numbers.contains(word.toString())){
                for (Map.Entry<String, Integer> entry : numlist.entrySet()) {
                    if (entry.getKey().equals(word.toString())) {
                        answer += entry.getValue();
                        answer *= 10;
                        word = new StringBuilder();
                    }
                }
            }
        }
        return answer/10;
    }
}