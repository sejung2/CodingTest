class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int s : students) {
            queue.offer(s);
        }

        int index = 0;
        int fails = 0;

        while (queue.size() > 0 && index < sandwiches.length) {
            if (queue.peek() == sandwiches[index]) {
                queue.poll();
                index++;
                fails = 0;
            } else {
                queue.offer(queue.poll());
                fails++;
            }

            if (fails == queue.size()) {
                break;
            }
        }
        return queue.size();
    }
}