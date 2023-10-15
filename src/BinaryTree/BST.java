package BinaryTree;

public class BST {
    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

          }

          private int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
          }

          public boolean isEmpty(){
        return root==null;
          }

          public void insert(int value){
        root=insert(value,root);
          }

    private Node insert(int value, Node root) {
    if (root==null){
        root = new Node(value);
    return root;
    }
    if (value< root.value){
        root.left=insert(value,root.left);
    }
    if (value>root.value){
        root.right=insert(value,root.right);
    }
    root.height=Math.max(height(root.left),height(root.right));
    return root;
    }

    public void populate(int[]nums){
        for (int i = 0; i < nums.length ; i++) {
            this.insert(nums[i]);
        }
    }
    public  void populateSorted(int[]nums){
        populateSorted(nums ,0,nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
    if (start>=end){
        return;
    }
    int mid = (start+end)/2;
    this.insert(nums[mid]);
    populateSorted(nums,start,mid);
    populateSorted(nums,mid+1, end);
    }


    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(this.root,"Root Node : " );
    }

    private void display(Node root, String s) {
        if (root==null){
            return;
        }
        System.out.println(s+root.value);
        display(root.left,"left child of " + root.value +" : ");
        display(root.right,"left child of " + root.value +" : ");
    }


}
