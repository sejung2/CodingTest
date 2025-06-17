class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");
        
        for(int i = 0; i < word.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(word[i].equals(morse[j])){
                    answer.append((char)(j + 97));
                }
            }
        }
        return answer.toString();
    }
}