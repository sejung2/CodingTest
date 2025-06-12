import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] dist = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++){
            dist[i] = Math.abs(numlist[i] - n);
        }
        
        for(int i = 0; i < numlist.length; i++){
            for(int j = i; j < numlist.length; j++){
                int temp;
                int dtemp;
                if(dist[i] > dist[j]){
                    temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                    temp = dist[i];
                    dist[i] = dist[j];
                    dist[j] = temp;
                } else if(dist[i] == dist[j]){
                    if(numlist[i] < numlist[j]){
                        temp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp;
                        temp = dist[i];
                        dist[i] = dist[j];
                        dist[j] = temp;
                    }
                }
            }
        }
        return numlist;
    }
}