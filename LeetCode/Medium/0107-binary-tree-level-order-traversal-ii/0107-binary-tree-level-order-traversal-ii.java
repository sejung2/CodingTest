class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        ArrayDeque<List<Integer>> resultStack = new ArrayDeque<>();

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
            resultStack.add(currentLevel);
        }

        while(!resultStack.isEmpty()){
            List<Integer> input = resultStack.pollLast();
            result.add(input);
        }
        return result;
    }
}