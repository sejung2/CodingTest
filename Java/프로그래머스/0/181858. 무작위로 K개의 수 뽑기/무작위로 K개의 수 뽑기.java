import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i]) && list.size() < k){
                list.add(arr[i]);
            }
        }
        while(list.size() < k){
            list.add(-1);
        }
        return list;
    }
}