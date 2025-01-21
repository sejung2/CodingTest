import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> attend = new TreeMap<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                attend.put(rank[i], i);
            }
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : attend.entrySet()){
            if(idx == 0) {
                a = entry.getValue();
            } else if(idx == 1) {
                b = entry.getValue();
            } else if(idx == 2) {
                c = entry.getValue();
                break;
            }
            idx++;
        }
        
        return 10000 * a + 100 * b + c;
    }
}