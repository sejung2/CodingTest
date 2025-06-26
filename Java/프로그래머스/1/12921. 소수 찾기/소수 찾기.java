class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = isPrime(n);
        for(int i = 0; i < prime.length; i++){
            if(prime[i]) answer++;
        }
        return answer;
    }
    
    public boolean[] isPrime(int n) {
        boolean[] isP = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isP[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isP[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isP[i] = false;
                }
            }
        }
        return isP;
    }
}