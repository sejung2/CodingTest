class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int x = image[0].length;
        int y = image.length;
        int[][] result = new int[x][y];

        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                result[j][i] = image[j][y - 1 - i] == 1 ? 0 : 1;
            }
        }

        return result;
    }
}