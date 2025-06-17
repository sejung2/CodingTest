class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < date1.length; i++){
            if(date1[i] != date2[i]){
                if(date1[i] < date2[i]){
                    return 1;
                } else return 0;
            }
        }
        return 0;
    }
}