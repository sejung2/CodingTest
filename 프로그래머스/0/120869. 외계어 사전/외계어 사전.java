class Solution {
    public int solution(String[] spell, String[] dic) {
        int length = spell.length;
        for(int i = 0; i < dic.length; i++){
            int end = 0;
            for(int j = 0; j < length; j++){
                if(dic[i].contains(spell[j])){
                    end++;
                }
            }
            if(length == end) return 1;
        }
        return 2;
    }
}