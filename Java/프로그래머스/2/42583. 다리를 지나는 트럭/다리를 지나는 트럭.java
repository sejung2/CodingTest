import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        int time = 0;
        int currentWeight = 0;
        
        // 1. full bridge
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        // 2. on boarding truck
        for (int i : truck_weights) {
            while(true) {
                time++;
                
                int outTruck = bridge.poll();
                currentWeight -= outTruck;
                
                if (currentWeight + i <= weight) {
                    bridge.offer(i);
                    currentWeight += i;
                    break;
                } else {
                    bridge.offer(0);
                }
                
            }
        }
        // 3. return time
        return time + bridge_length;
    }
}