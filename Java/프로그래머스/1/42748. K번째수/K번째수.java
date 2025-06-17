import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] arr = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int ind = commands[i][2];
            System.out.println("start" + "[" + i + "]" + " " + start);
            System.out.println("end" + "[" + i + "]" + " " + end);
            System.out.println("ind" + "[" + i + "]" + " " + ind);
            int[] list = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(list);
            arr[i] = list[ind-1];
            
        }
        return arr;
    }
}