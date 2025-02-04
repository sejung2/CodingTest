class Solution {
    public int solution(int[] numbers, int k) {
        int count = 0;
        for(int i = 1; i < k; i++){
            count += 2;
        }
        if(count >= numbers.length){
            count = count % numbers.length;
        }
        return numbers[count];
    }
}