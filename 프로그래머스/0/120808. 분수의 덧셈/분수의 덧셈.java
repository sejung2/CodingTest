class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int up = numer1*denom2 + numer2*denom1;
        int down = denom1 * denom2;
        int result = gcd(up, down);
        answer[0] = up/result;
        answer[1] = down/result;
        return answer;
    }
    
    static int gcd(int a, int b){
	while(b!=0){
		int r = a%b;
		a= b;
		b= r;
	}
	return a;
}
}