import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numlist, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            result.add(numlist[i]);
        }
        Collections.sort(result, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                int distA = Math.abs(a - n);
                int distB = Math.abs(b - n);
                
                if(distA == distB){
                    return b - a;
                }
                return distA - distB;
            }
        });
        return result;
    }
}
