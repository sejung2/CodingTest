import java.util.*;
class Solution {
    public ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        int end = my_str.length();
        for(int i = 0; i < end; i += n){
            String input;
            if(i+n > end){
                input = my_str.substring(i, end);
            } else {
                input = my_str.substring(i, i + n);
            }
            list.add(input);
        }
        return list;
    }
}