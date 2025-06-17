class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) < 97){
                result[(int)my_string.charAt(i)-65]++;
            } else result[(int)my_string.charAt(i)-71]++;
        }
        return result;
    }
}