import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int limit = nums.length / 2;
        return set.size() > limit ? limit : set.size();
    }
}