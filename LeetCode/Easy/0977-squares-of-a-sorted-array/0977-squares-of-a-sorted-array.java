class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while(left <= right) {
            int leftSide = (nums[left] * nums[left]);
            int rightSide = (nums[right] * nums[right]);

            if (leftSide < rightSide) {
                result[index] = rightSide;
                right--;
            } else {
                result[index] = leftSide;
                left++;
            }
            index--;
        }

        return result;
    }
}