import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            StringBuilder input = new StringBuilder();
            for(int l = 0; l < picture[i].length(); l++){
                for(int j = 0; j < k; j++){
                    input.append(picture[i].charAt(l));
                }
            }
            for(int x = 0; x < k; x++) list.add(input.toString());
        }
        return list;
    }
}