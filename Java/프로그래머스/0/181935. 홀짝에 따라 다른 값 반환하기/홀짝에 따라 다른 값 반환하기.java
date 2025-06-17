class Solution {
    public int solution(int n) {
        int sum = 0;
        boolean isEven = (n%2 == 0);
        
        
        while(n > 0){
            if((n % 2) == 0 && isEven){
                sum += n*n;
                System.out.println(sum);
                n--;
                continue;
            } else if((n % 2) != 0 && !isEven){
                sum += n;
                System.out.println(sum);
                n--;
                continue;
            }
            else n--;
        }
        return sum;
    }
}