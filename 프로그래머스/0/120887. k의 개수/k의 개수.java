class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int start = i; start <= j; start++){
            answer += cal(start, k);
        }
        return answer;
    }
    
    public int cal(int num, int k){
        int result = 0;
        while(num != 0){
            if(num % 10 == k){
                result++;
                num /= 10;
            } else num /= 10;
        }
        return result;
    }
}