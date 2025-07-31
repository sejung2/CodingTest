class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = gcd(n, m);;
        answer[0] = max;
        answer[1] = (n * m) / max;
        return answer;
    }
    
    public int gcd(int n, int m){
        if(m == 0) return n;
        return gcd(m, n%m);
    }
}