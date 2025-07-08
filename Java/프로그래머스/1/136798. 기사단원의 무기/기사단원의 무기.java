class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knights = new int[number + 1];
        
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number; j += i){
                knights[j]++;
            }
        }
        
        for(int i = 1; i <= number; i++){
            if(knights[i] > limit){
                knights[i] = power;
            }
            answer += knights[i];
        }
        return answer;
    }
}