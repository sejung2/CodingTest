import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int endTime = Integer.parseInt(br.readLine());
        
        hour += (minute + endTime) / 60;
        minute = (minute + endTime) % 60;
        
        if (hour >= 24) {
            hour = hour % 24;
        }
        
        System.out.println(hour + " " + minute);
    }
}
