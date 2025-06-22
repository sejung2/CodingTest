import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        int min = arr[0];
        
        for(int num : arr){
            if(min > num) min = num;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num != min){
                list.add(num);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        return list;
    }
}