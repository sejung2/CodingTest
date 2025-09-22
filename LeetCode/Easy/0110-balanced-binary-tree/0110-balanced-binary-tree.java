class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int check = level(root);
        return check == -1 ? false : true;
    }

    public int level(TreeNode root) {
        if(root == null) return 0;

        int left = level(root.left);
        int right = level(root.right);
        
        int max = Math.max(left, right);
        int min = Math.min(left, right);

        if(max == -1 || min == -1) return -1;
        if(max - min > 1){
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}