import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binary1 = new String[n];
        String[] binary2 = new String[n];
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            binary1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            binary2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
        }
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(binary1[i].charAt(j) == '1' || binary2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
        }
        
        return result;
    }
}