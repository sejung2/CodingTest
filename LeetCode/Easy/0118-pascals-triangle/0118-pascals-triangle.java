class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i = 1; i < numRows; i++) {
            List<Integer> currentLevel = new ArrayList<>();
            List<Integer> preLevel = result.get(i - 1);

            currentLevel.add(1);

            for(int j = 0; j < preLevel.size() - 1; j++){
                int sum = preLevel.get(j) + preLevel.get(j+1);
                currentLevel.add(sum);
            }

            currentLevel.add(1);
            result.add(currentLevel);
        }
        return result;
    }
}