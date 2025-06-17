import java.util.*;
class Solution {
    public Set<Integer> solution(int n) {
        Set<Integer> set = new TreeSet<>();
        int prime = 2;
        while(n != 1){
            if(n % prime == 0){
                n /= prime;
                set.add(prime);
            } else {
                prime++;
            }
        }
        return set;
    }
}