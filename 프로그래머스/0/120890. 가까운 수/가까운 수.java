import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int near = 100;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int num = Math.abs(n - array[i]);
            if(num < near){
                near = num;
                answer = array[i];
            }
        }
        return answer;
    }
}