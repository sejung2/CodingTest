import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        
        int count = 0;
        
        Arrays.sort(wallet);
        
        while(wallet[0] < bill[0] || wallet[1] < bill[1]) {
               
            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            
            Arrays.sort(bill);
            count++;
        }
        return count;
    }
}