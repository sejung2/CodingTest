import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(true){
            if(n==1) return list;
            if((n % 2) == 0){
                n = n/2;
                list.add(n);
            } else{
                n = 3*n+1;
                list.add(n);
            }
        }
    }
}