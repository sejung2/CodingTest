class Solution {
    public int solution(int a, int b) {
        int str1 = Integer.parseInt(""+a+b);
        int str2 = 2*a*b;
        return str1 > str2 ? str1 : str2;
    }
}