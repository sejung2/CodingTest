import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            if(list.isEmpty() && myString.charAt(0) == 'x'){
                list.add(count);
            } else if(myString.charAt(i) == 'x'){
                list.add(count);
                count = 0;
            } else count++;
        }
        list.add(count);
        return list;
    }
}