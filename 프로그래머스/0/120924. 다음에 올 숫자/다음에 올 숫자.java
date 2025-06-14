class Solution {
    public int solution(int[] common) {
        int dist = common[1] - common[0];
        int dist2 = common[2] - common[1];
        if(dist == dist2){
            return common[common.length - 1] + dist;
        } else return common[common.length - 1] * (dist2 / dist);
    }
}