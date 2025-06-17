import java.util.*;
class Solution {
    public ArrayList<Integer>[] solution(int n) {
        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i = 0; i < n; i++){
            list[i] = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if(i == j){
                    list[i].add(1);
                } else list[i].add(0);
            }
        }
        return list;
    }
}