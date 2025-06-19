class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int loop = food[i] / 2;
            for(int j = 0; j < loop; j++){
                answer.append(i);
            }
        }
        String result = answer + "0";
        return result + answer.reverse();
    }
}