class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> target = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) {
            target.offer(i);
        }

        while(target.size() >= 2) {
            int a = target.poll();
            int b = target.poll();
            if (a == b) continue;
            target.offer(a > b ? (a - b) : (b - a));
        }

        return target.poll();
    }
}