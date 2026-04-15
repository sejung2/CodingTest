import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (i != 0) {
                bw.newLine();
            }
            bw.write("" + (a + b));
        }
        bw.flush();
        bw.close();
    }
}
