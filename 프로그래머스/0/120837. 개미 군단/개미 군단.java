class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0){
            if(hp >= 5){
                hp = hp - 5;
                answer++;
            } else if(hp >= 3){
                hp = hp - 3;
                answer++;
            } else {
                hp = hp - 1;
                answer++;
            }
        }
        return answer;
    }
}