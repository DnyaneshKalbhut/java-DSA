package BinaryTree.BFS;




public class ConnectNodes {

    private class Node{
        Node right;
        Node left;
        int val;
        Node next;

       public void ConnectNodes(){}
        public Node(int val) {
            this.val = val;
        }

        public Node(Node right, Node left, int val, Node next) {
            this.right = right;
            this.left = left;
            this.val = val;
            this.next = next;
        }
    }
    public Node connect(Node root){

        if (root==null){
            return null;
        }

        Node leftMost =root;
        while (leftMost.left!=null){
            Node current=leftMost;
            while (current!=null){
                current.left.next=current.right;
                if (current.next!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            leftMost=leftMost.left;
        }


        return root;
    }
}
