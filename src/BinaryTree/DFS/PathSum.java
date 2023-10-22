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

        public int sumNum(TreeNode node){
            return helper(node , 0);
        }
    }

    private int helper(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }

        sum = sum*10 + root.val;

           if (root.left==null && root.right==null){
               return sum;
           }
        return helper(root.left , sum ) + helper(root.right , sum);

    }

    public boolean pathExist(TreeNode node , int[]arr){
        if (node==null){
            return false;
        }
        return  helper(node ,arr ,0);
    }

    private boolean helper(TreeNode node, int[] arr, int i) {
        if (node == null){
            return arr.length==0;
        }

        if (i>= arr.length || node.val!=arr[i]){
            return false;
        }

        if (node.left ==null && node.right==null){
            return true;
        }

        return helper(node.left , arr , i+1) || helper(node.right , arr , i+1);
    }
}