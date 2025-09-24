class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if((root.val == targetSum) && (root.left == null && root.right == null)) return true;
        targetSum -= root.val;
        boolean left = sum(root.left, targetSum);
        boolean right = sum(root.right, targetSum);
        return left || right;
    }

    public boolean sum(TreeNode root, int targetSum) {
        if(root == null) return false;
        int target = targetSum - root.val;
        if(target == 0){
            if(root.left == null && root.right == null){
                return true;
            }
        }

        boolean left = sum(root.left, target);
        boolean right = sum(root.right, target);

        return left || right;
    }
}