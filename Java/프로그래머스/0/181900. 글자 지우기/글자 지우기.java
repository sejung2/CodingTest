import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        for(int i = 0; i < indices.length; i++){
            if(sb.length() == 0){
                sb.deleteCharAt(indices[i]);
            }
            sb.deleteCharAt(indices[i]-i);
        }
        return sb.toString();
    }
}