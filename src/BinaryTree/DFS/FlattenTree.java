package BinaryTree.DFS;

import BinaryTree.BFS.BinaryTreeLevelOrdertraversal;

public class FlattenTree {
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
    public void flatten(TreeNode root){
    TreeNode current = root;

    while (current!=null){
        if (current.left!=null){
            TreeNode temp = current.left;
            while (temp.right!=null){
                temp=temp.right;
            }
            temp.right=current.right;
            current.right=current.left;

        }
        current=current.right;
    }

    }
}
