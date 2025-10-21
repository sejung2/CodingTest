class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int index = 1;

        for(int i = 0; i < nums.length; i++) {
            for(int j = index; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
            index++;
        }

        return result;
    }
}