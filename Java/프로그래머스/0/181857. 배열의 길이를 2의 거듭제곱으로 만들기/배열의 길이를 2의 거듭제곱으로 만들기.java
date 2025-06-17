import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        int num = 1;
        int stand = arr.length;
        while(num < stand){
            num *= 2;
            if(num == stand){
                return list;
            }
        }
        for(int i = 0; i < num - stand; i++){
            list.add(0);
        }
        return list;
    }
}