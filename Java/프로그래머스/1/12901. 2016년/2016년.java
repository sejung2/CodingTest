class Solution {
    public String solution(int a, int b) {
        String[] weeks = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int targetDay = b - 1;
        for (int i = 0; i < a - 1; i++) {
            targetDay += days[i];
        }
        targetDay = targetDay % 7;
        
        return weeks[targetDay];
    }
}