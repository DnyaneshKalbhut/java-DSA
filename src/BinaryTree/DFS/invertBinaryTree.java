package BinaryTree.DFS;


import com.sun.source.tree.Tree;

public class invertBinaryTree {
    public class TreeNode{
        int val;
       TreeNode left ;
     TreeNode right;
        TreeNode(){}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;
        }

        TreeNode Left = invertTree(root.left);
        TreeNode Right = invertTree(root.right);

        root.right=Left;
        root.left=Right;

        return root;
    }

    public int DepthTree(TreeNode root){
        if (root==null){
            return 0;
        }

        int right = DepthTree(root.right);
        int left = DepthTree(root.left);

        int depth=Math.max(right,left)+1;
        return depth;
    }
}
