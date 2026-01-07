class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // current number
            int currentNum = nums[i];
            // need number
            int needNum = target - currentNum;
            //if map has needNum
            if (map.containsKey(needNum)) {
                return new int[] {map.get(needNum), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}