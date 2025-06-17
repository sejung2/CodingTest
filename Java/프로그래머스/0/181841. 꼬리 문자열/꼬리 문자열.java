import java.util.*;
class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                result.append(str_list[i]);
            }
        }
        return result.toString();
    }
}