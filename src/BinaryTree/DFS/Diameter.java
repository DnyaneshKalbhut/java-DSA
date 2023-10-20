package BinaryTree.DFS;




public class Diameter {

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
     int  diameter=0;
    public int diameter(TreeNode root){
        height(root);
        return diameter-1;
    }

    public int height(TreeNode node ){

        int left = height(node.left);
        int right = height(node.right);

        int dia = left+right+1;
        diameter=Math.max(diameter,dia);
        return  Math.max(left , right)+1;
    }
}
