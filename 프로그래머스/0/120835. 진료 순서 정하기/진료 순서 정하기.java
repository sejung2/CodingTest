import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] emergency) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> pos = new LinkedHashMap();
        Map<Integer, Integer> flow = new HashMap();
        int count = emergency.length;
        for(int i = 0; i < emergency.length; i++){
            pos.put(emergency[i], i);
        }
        Arrays.sort(emergency);
        for(int i = 0; i < emergency.length; i++){
            flow.put(emergency[i], count--);
        }
        
        for(Map.Entry<Integer, Integer> entry : pos.entrySet()){
            list.add(flow.get(entry.getKey()));
        }
        return list;
    }
}