class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n / a > 0){
            int get = n / a * b;
            answer += get;
            int remain = n % a;
            n = get + remain;
        }
        return answer;
    }
}