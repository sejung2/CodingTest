import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        String[] arr = my_string.replaceAll("\\D", "").split("");
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        return list;
    }
}