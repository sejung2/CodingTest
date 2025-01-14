import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] arr1 = arr.clone();
        int count = 0;
        
        while(true){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 ==1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if(Arrays.equals(arr, arr1)){
                return count;
            } else arr1 = arr.clone();
            count++;
        }
    }
}