class Solution {
    public void moveZeroes(int[] nums) {
        int numPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[numPos] = nums[i];
                nums[i] = temp;
                numPos++;
            }
        }
    }
}