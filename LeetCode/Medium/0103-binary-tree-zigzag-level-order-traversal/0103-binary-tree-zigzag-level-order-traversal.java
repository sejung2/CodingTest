class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
    
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return result;
        queue.add(root);

        boolean flag = false;

        while(!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
        
                    if(currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
            }

            if(flag){
                flag = false;
                Collections.reverse(currentLevel);
                result.add(currentLevel);
            } else {
                flag = true;
                result.add(currentLevel);
            }
        }
        return result;
    }
}