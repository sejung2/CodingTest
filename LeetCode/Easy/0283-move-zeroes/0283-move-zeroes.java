class Solution {
    public void moveZeroes(int[] nums) {
        int input = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            int temp = nums[i];
            nums[i] = nums[input];
            nums[input] = temp;

            input++;
        }
    }
}