import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuilder num = new StringBuilder(Integer.toString(n, 3));
        num.reverse();
        return Integer.parseInt(num.toString(), 3);
    }
}