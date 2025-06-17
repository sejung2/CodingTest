class Solution {
    public boolean solution(int x) {
        int target = x;
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        return target % sum == 0 ? true : false;
    }
}