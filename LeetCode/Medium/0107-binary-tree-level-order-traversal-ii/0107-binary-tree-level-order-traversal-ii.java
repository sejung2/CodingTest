class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();

            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < level; i++){
                TreeNode current = queue.poll();
                currentLevel.add(current.val);
                
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(currentLevel);
        }

        Collections.reverse(result);
        return result;
    }
}