class Solution {
    
    int result = 0;
    boolean[] visited;

    public int solution(int n, int[][] computers) {
         visited = new boolean[computers.length];
        
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                dfs(computers, i);
                result++;
            }
        }
        return result;
    }
    
    public void dfs(int[][] computers, int index) {
        visited[index] = true;
        
        for (int i = 0; i < computers.length; i++) {
            if (computers[index][i] != 0 && !visited[i]) {
                dfs(computers, i);
            }
        }
    }
}