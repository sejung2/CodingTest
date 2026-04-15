import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        
        int count = size / 4;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }
        sb.append("int");
        
       System.out.println(sb.toString());
    }
}
