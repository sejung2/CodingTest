class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int eq = 0;
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            if(word == 'p' || word == 'P'){
                eq++;
            } else if(word == 'y' || word == 'Y'){
                eq--;
            }
        }

        return eq == 0 ? true : false;
    }
}