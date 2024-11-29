import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int count = 0;
        int[] student = new int[n];
        
        for(int i = 0; i < n; i++){
            student[i] = 1;
        }
        
        for(int i = 0; i < reserve.length; i++){
            student[reserve[i]-1] = 2;
        }
        
        for(int i = 0; i < lost.length; i++){
            if(student[lost[i]-1] == 2){
                student[lost[i]-1] = 1;
                continue;
            } else student[lost[i]-1] = 0;
            
        }
        
        for(int i : student){
            System.out.println("test :" + i);
        }
        
        for(int i = 0; i < n-1; i++){
            if(student[i] == 0 && student[i+1] == 2){
                student[i+1]--;
                student[i]++;
            }
            if(student[i] == 2 && student[i+1] == 0){
                student[i+1]++;
                student[i]--;
            }
            
        }
        
        for(int i = 0; i < n; i++){
            if(student[i] > 0){
                System.out.println(i + " check : " + student[i]);
                count++;
            }
        }
        return count;
    }
}