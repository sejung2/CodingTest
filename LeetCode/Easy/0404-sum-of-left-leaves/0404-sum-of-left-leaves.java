class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> flag = new LinkedList<>();
        queue.add(root);
        flag.add(0);

        while(!queue.isEmpty()) {
            int level = queue.size();

            for(int i = 0; i < level; i++) {
                TreeNode current = queue.poll();
                int currentFlag = flag.poll();

                if((current.left == null && current.right == null) && currentFlag == 1) {
                    result += current.val;
                }

                if(current.left != null) {
                    queue.add(current.left);
                    flag.add(1);
                }
                if(current.right != null) {
                    queue.add(current.right);
                    flag.add(0);
                }
            }
        }
        return result;
    }
}