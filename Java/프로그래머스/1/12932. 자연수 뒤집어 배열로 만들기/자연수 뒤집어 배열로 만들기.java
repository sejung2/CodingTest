import java.util.*;
class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while(n != 0){
            list.add(n % 10);
            n /= 10;
        }
        return list;
    }
}