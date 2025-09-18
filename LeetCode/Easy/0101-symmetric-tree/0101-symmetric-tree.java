class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isSym(root.left, root.right);
    }

    public boolean isSym(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null && rightNode == null) return true;
        if(leftNode == null || rightNode == null) return false;
        if(leftNode.val != rightNode.val) return false;
        boolean left = isSym(leftNode.left, rightNode.right);
        boolean right = isSym(leftNode.right, rightNode.left);
        return left && right;
    }
}