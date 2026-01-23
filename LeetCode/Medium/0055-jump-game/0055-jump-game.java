class Solution {
    public boolean canJump(int[] nums) {
        int limit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > limit) {
                return false;
            }
            limit = Math.max(limit, i + nums[i]);
        }
        return true;
    }
}