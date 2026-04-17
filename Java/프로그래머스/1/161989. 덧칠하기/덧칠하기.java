class Solution {
    public int solution(int n, int m, int[] section) {
        
        int result = 1; // 밀고 시작
        int workArea = section[0] + m - 1;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > workArea) {
                workArea = section[i] + m - 1;
                result++;
            }
            
        }
        
        return result;
    }
}