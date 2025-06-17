import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++){
            char str = a.charAt(i);
            if(Character.isUpperCase(str)){
                System.out.print((char)(str+32));
            }
            else System.out.print((char)(str-32));
        }
    }
}