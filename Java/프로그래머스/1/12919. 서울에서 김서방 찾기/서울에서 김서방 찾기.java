class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        for(String x : seoul){
            if(x.equals("Kim")){
                return "김서방은 " + index + "에 있다";
            } else index++;
        }
        return "";
    }
}