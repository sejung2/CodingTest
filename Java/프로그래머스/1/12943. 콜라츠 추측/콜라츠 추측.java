class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num == 1) return answer;

        for(int i = 0; i < 500; i++){
            if(num % 2 == 0){
                num /= 2;
                answer++;
            } else if(num % 2 == 1){
                num = num * 3 + 1;
                answer++;
            }
            if(num == 1) return answer;
        }
        return -1;
    }
}