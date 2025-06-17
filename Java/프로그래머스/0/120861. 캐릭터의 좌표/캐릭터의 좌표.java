import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int board_width = board[0]/2;
        int board_height = board[1]/2;
        int moveX = 0;
        int moveY = 0;
        
        for(int i = 0; i < keyinput.length; i++){
            
            if(keyinput[i].equals("left")){
                moveX -= 1;
                if(moveX < -board_width) moveX = -board_width;
                continue;
            }
            if(keyinput[i].equals("right")){
                moveX += 1;
                if(moveX > board_width) moveX = board_width;
                continue;
            }
            if(keyinput[i].equals("up")){
                moveY += 1;
                if(moveY > board_height) moveY = board_height;
                continue;
            }
            if(keyinput[i].equals("down")){
                moveY -= 1;
                if(moveY < -board_height) moveY = -board_height;
                continue;
            }
        }
        
        int[] result = {moveX,moveY};
        
        return result;
    }
}