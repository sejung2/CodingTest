import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int end = 0;
        while(end < arr.length){
            for(int i = 0; i < arr.length; i++){
                if(stk.isEmpty()){
                    stk.add(arr[i]);
                    end++;
                } else if(stk.get(stk.size() - 1) == arr[i]){
                    stk.remove(stk.size() - 1);
                    end++;
                } else {
                    stk.add(arr[i]);
                    end++;
                }
            }
        }
        if(stk.isEmpty()) stk.add(-1);
        return stk;
    }
}