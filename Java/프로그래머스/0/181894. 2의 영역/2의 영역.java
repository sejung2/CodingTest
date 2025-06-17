import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                index.add(i);
            }
        }
        
        if(index.size() == 0){
            list.add(-1);
            return list;
        }
        
        int start = index.get(0);
        int end = index.get(index.size()-1);
        for(int i = start; i <= end; i++){
            list.add(arr[i]);
        }
        
        return list;
    }
}