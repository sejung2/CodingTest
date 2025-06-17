class Solution {
    public int[][] solution(int[][] arr) {
        
        if(arr[0].length == arr.length){
            return arr;
        }
        int stand = 0;
        stand = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] list = new int[stand][stand];
        if(arr.length > arr[0].length){
            for(int i = 0; i < stand; i++){
                int[] input = new int[stand];
                for(int j = 0; j < arr[0].length; j++){
                    input[j] = arr[i][j];
                }
                list[i] = input;
            }
        } else if(arr.length < arr[0].length){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    list[i][j] = arr[i][j];
                }
            }
        }
        return list;
    }
}