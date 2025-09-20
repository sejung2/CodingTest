class Solution {
    int level = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            level++;
        }
        return level;
    }
}