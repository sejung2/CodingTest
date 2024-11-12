import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a_price = sc.nextLong();
        int count = sc.nextInt();
        long result = 0;
        for(int i = 0; i < count; i++){
            long price = sc.nextLong();
            long many = sc.nextLong();
            result += price*many;
        }
        if(a_price == result){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}