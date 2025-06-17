class Solution {
    public String solution(String code) {
        String str = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char a = code.charAt(i);
            if(a == '1'){
                if(mode == 0){
                    mode = 1;
                } else mode = 0;
                continue;
            }
            if(mode==0){
                if(i%2 == 0){
                    str += a;
                }
            } else if(mode == 1){
                if(i%2 == 1){
                    str += a;
                }
            }
        }
        return str.isEmpty() ? "EMPTY" : str;
    }
}