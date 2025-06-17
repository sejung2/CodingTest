import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        if(numbers[0] > 0){
            return numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }
        int max = -1000000000;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(max < numbers[i] * numbers[j]){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}