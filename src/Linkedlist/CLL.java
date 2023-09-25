package Linkedlist;

public class CLL {

    Node head;
    Node tail;

    public CLL() {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int val){
        Node node =new Node(val);
        if (head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node = head;
        if (node!=null){
            do {
                System.out.print(node.val+"-->");
                node=node.next;
            }while (node!=head);
        }
        System.out.print("end");
    }

    public void delete(int value){
     Node node =head;
     if (node==null){
         return;
     }
     if (node.val==value){
         head=head.next;
         tail.next=head;
         return;
     }
     do {
         Node n =node.next;
         if (n.val==value){
         node.next = n.next;
         break;
       }
         node=node.next;
     }while (node!=head);
    }
    private class Node{
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
