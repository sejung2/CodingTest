import java.util.*;
class Solution {
    public Set<String> solution(String my_string) {
        String[] answer = {};
        Set<String> list = new TreeSet<>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i));
        }
        
        return list;
    }
}