class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        return search(p, q);
    }

    public boolean search(TreeNode nodeA, TreeNode nodeB) {
        if((nodeA == null && nodeB == null)) return true;
        if((nodeA == null || nodeB == null)) return false;
        if(nodeA.val != nodeB.val) return false;
        boolean left = search(nodeA.left, nodeB.left);
        boolean right = search(nodeA.right, nodeB.right);
        return left && right;
    }
}