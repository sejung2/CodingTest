import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            int word = Integer.parseInt(intStrs[i].substring(s, s+ l));
            System.out.println(word);
            if(word > k){
                list.add(word);
            }
        }
        return list;
    }
}