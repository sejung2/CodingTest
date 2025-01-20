import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int length = strArr.length;
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            int index = strArr[i].length();
            arr[index]++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}