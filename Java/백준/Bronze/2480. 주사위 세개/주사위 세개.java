import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] nums = new String[st.countTokens()];
        
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = st.nextToken();
            if (Integer.parseInt(nums[i]) > max) {
                max = Integer.parseInt(nums[i]);
            }
        }
        
        // 같은 눈 3개 10,000원 + (같은 눈) * 1000원
        // 같은 눈 2개 1,000원 + (같은 눈) * 100원
        // 모두 다른 눈 (그 중 가장 큰 눈) * 100원
        int result = 0;
        if (nums[0].equals(nums[1]) && nums[0].equals(nums[2])) {
            result = 10000 + Integer.parseInt(nums[0]) * 1000;
        } else if(nums[0].equals(nums[1]) || nums[0].equals(nums[2])) {
            result = 1000 + Integer.parseInt(nums[0]) * 100;
        } else if(nums[1].equals(nums[2])){
            result = 1000 + Integer.parseInt(nums[1]) * 100;
        } else {
            result = max * 100;
        }
        
        System.out.println(result);
    }
}
