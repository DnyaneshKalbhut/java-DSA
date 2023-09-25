package Linkedlist;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node temp =head;
        Node last = null;

        while (temp!=null){
            System.out.print(temp.val +"-> ");
           temp= temp.next;
        }
        System.out.print("End");

        System.out.println("print in reverse");
        while (last!=null){
            System.out.print(last.val+" ->");
            last=last.prev;
        }
        System.out.print("end");
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last!=null){
            last=last.next;
        }

        node.prev=last;
        last.next=node;
    }

    public void insert(int after,int val ){
        Node p =findVal(after);
        if (p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);

        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }
    }
    public Node findVal(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;

        }
        return null;

    }

    private class Node{
        int val ;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
