class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isBlank()) return true;

        int s_index = 0;
        int t_index = 0;

        while(s_index < s.length() && t_index < t.length()){
            if(t.charAt(t_index) == s.charAt(s_index)) {
                s_index++;
            }
            t_index++;
        }
        return s_index == s.length() ? true : false;
    }
}