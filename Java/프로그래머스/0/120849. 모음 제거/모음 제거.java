import java.util.*;
import java.util.regex.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Matcher matcher = Pattern.compile("[^aeiou]").matcher(my_string);
        
        while (matcher.find()) {
            answer.append(matcher.group());
        }
        return answer.toString();
    }
}