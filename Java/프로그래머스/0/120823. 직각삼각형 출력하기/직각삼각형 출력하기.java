import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        StringBuilder star = new StringBuilder();
        for(int i = 0; i < n; i++){
            star.append("*");
            System.out.println(star.toString());
        }
    }
}