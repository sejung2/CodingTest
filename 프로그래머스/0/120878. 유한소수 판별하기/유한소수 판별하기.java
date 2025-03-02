class Solution {
    public int solution(int a, int b) {
        int p = b / gcd(a,b);
        while(p != 1){
            if(p % 2 == 0){
                p /= 2;
            } else if(p % 5 == 0){
                p /= 5;
            } else return 2;
        }

        return 1;
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