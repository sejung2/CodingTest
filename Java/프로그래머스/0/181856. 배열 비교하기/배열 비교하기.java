class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a1 = 0;
        int a2 = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        } else if(arr1.length < arr2.length){
            return -1;
        }
        
        for(int a : arr1){
            a1 += a;
        }
        
        for(int b : arr2){
            a2 += b;
        }
        
        if(a1 > a2){
            return 1;
        } else if( a1 < a2){
            return -1;
        } else return 0;
    }
}