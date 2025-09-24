class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int currentLevel = queue.size();

            for(int i = 0; i < currentLevel; i++){
                TreeNode current = queue.poll();

                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return root;
    }
}