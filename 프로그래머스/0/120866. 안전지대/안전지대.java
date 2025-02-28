class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int xlen = board.length;
        int ylen = board[0].length;
        int[][] scan = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    scan[i][j] = 2;
                    if(i > 0) scan[i-1][j] = 2;
                    if(i < xlen - 1) scan[i+1][j] = 2;
                    if(j < ylen - 1) scan[i][j+1] = 2;
                    if(j > 0) scan[i][j-1] = 2;
                    if(i > 0 && j > 0) scan[i-1][j-1] = 2;
                    if(i < xlen - 1 && j > 0) scan[i+1][j-1] = 2;
                    if(i > 0 && j < ylen - 1) scan[i-1][j+1] = 2;
                    if(i < xlen - 1 && j < ylen - 1) scan[i+1][j+1] = 2;
                }
            }
        }
        for(int i = 0; i < scan.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(scan[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}