class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        for(int i = 0; i <= n; i++) {
            String num = Integer.toBinaryString(i);

            int current = 0;
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '1') current++;
            }
            result[i] = current;
        }
        return result;
    }
}