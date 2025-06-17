class Solution {
    public int solution(int n) {
        int answer = 0;
        while(facto(answer) <= n){
            answer++;
        }
        return facto(answer) <= n ? answer : answer - 1;
    }
    
    public int facto(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}