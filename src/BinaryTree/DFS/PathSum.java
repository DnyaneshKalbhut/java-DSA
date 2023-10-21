package BinaryTree.DFS;

public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public boolean pathsum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }

            if (root.val == sum && root.left == null && root.right == null) {
                return true;
            }
            return pathsum(root.left, sum - root.val) || pathsum(root.right, sum - root.val);

        }
    }
}