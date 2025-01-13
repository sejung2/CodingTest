import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        int index = 0;
        String stand = "";
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                stand += str_list[i];
                index += i;
                break;
            }
        }
        
        if(stand == "") return list;
        
        if(stand.equals("l")){
            for(int i = 0; i < index; i++){
                list.add(str_list[i]);
            }
        } else if(stand.equals("r")){
            for(int i = index+1; i < str_list.length; i++){
                list.add(str_list[i]);
            }
        }
        return list;
    }
}