import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> delete = new ArrayList<>();
        for(int i : delete_list){
            delete.add(i);
        }
        for(int i : arr){
            if(!delete.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}