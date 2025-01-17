import java.util.*;
class Solution {
    public ArrayList<String> solution(String myString) {
        myString.trim();
        String[] result = myString.split("x");
        Arrays.sort(result);
        ArrayList<String> list = new ArrayList<>();
        for(String word : result){
            if(!word.isEmpty()){
                list.add(word);
            }
        }
        return list;
    }
}