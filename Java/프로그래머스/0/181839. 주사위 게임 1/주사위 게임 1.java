import java.math.*;
class Solution {
    public int solution(int a, int b) {
        int stand = a + b;
        if(stand % 2 == 0){
            return a % 2 == 0 ? Math.abs(a - b) : (a*a) + (b*b);
        } else return 2 * (a + b);
    }
}