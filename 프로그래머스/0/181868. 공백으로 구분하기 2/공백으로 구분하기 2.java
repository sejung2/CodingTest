import java.util.*;
class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] test = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(String word : test){
            if(!word.equals("")){
                list.add(word);
            }
        }
        return list;
    }
}