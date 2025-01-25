class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 1;
        int loop = n;
        int x = -1;
        int y= 0;
        int turn = 1;
        while(true){
            for(int i = 0; i < loop; i++){
                x += turn;
                answer[y][x] = count++;
            }
            loop--;
            if(loop == 0) break;
            for(int i = 0; i < loop; i++){
                y += turn;
                answer[y][x] = count++;
            }
            turn *= -1;
        }
        return answer;
    }
}