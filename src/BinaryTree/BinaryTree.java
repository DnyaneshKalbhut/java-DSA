package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node{
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
   private Node root;
    //insert Element
    public void insert(Scanner sc){
        System.out.println("Enter a root node: ");
        int value =sc.nextInt();
        root=new Node(value);
        insert(sc,root);
    }

    private void insert(Scanner sc, Node node) {
        System.out.println("Do you want to enter in left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("enter the value" + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean right=sc.nextBoolean();
        if (right){
            System.out.println("Enter a value in right of " + node.value);
            int value = sc.nextInt();
            node.right=new Node(value);
        }
    }

    public void display(){
        display(this.root," ");
    }

    private void display(Node node, String space) {
        if (node==null){
            return;
        }

        System.out.println(space+ node.value);
        display(node.left,space +"\t");
        display(node.right,space+"\t");
    }
}
