import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        num_list = Arrays.copyOfRange(num_list, 5, num_list.length);
        return num_list;
    }
}