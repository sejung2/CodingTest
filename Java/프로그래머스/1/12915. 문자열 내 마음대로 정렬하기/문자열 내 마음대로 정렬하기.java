import java.util.*;

class Solution {
    public List<String> solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        for(String s : strings){
            answer.add(s);
        }
        answer.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.charAt(n) == b.charAt(n)){
                    return a.compareTo(b);
                }
                if(a.charAt(n) > b.charAt(n)) return 1;
                else return -1;
            }
        });
        return answer;
    }
}