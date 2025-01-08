import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        a =arr[0]; b = arr[1]; c = arr[2]; d = arr[3];
        
        return a==d ? a*1111 :
        a==c ? (10*a+d)*(10*a+d) :
        b==d      ? (10*b+a)*(10*b+a) :
        a==b&c==d ? c*c-a*a :
        a==b      ? c*d :
        b==c      ? a*d :
        c==d      ? a*b :
        a;
        
    }
}