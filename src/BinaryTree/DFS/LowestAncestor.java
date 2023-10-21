package BinaryTree.DFS;

public class LowestAncestor {

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

        public TreeNode LowestAncestor(TreeNode root , TreeNode p , TreeNode q){
            if (root==null){
                return  null;
            }
            if (root==p || root==q){
                return root;
            }

            TreeNode left = LowestAncestor(root.left,p,q);
            TreeNode right = LowestAncestor(root.right,p,q);

            if (left!=null && right!=null){
                return root;
            }
            return left==null ? right:left;



        }

    }

    public int KthNum(TreeNode root , int k){
        return helper(root ,  k).val;
    }

    int count = 0;
    public TreeNode helper(TreeNode root , int k){
        if (root == null){
            return  null;
        }

        TreeNode left = helper(root.left , k);

        if (left!=null){
            return left;
        }
        count++;
        if (count==k){
            return root;
        }
        return helper(root.right,k);
    }
    }
