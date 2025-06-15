import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder star = new StringBuilder();
        
        for(int i = 0; i < a; i++){
            star.append("*");
        }
        for(int i = 0; i < b; i++){
            System.out.println(star.toString());
        }
    }
}