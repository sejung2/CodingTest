class Solution {
    public int solution(int balls, int share) {
        if((balls - share) < share) share = balls - share;
        double child = factorial(balls, share);
        double parent = factorial(share, share);
        return (int)(child/(parent));
    }
    
    public double factorial(double ball, double r){
        double result = 1;
        for(double i = 0; i < r; i++){
            result *= (ball-i);
            System.out.println(result);
        }
        return result;
    }
}