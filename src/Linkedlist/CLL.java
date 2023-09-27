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

    //questions

    //find a cycle
    public static boolean findCycle(Node head){
        Node fast=head;
        Node slow=head;
    while (fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if (fast==slow){
            return true;
        }
    }
    return false;
    }

    public static Node DetectCycle(Node head){
        int length=0;
        Node fast=head;
        Node slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                length=LengthCycle(slow);
        break;
            }
        }
        if (length==0){
            return null;
    }
        Node f = head;
        Node s = head;
        while (length>0){
            s=s.next;
            length--;
        }
        while (f!=s){
            f=f.next;
            s=s.next;
        }

        return s;
}

public static boolean isHapy(int n){
        int slow = n;
        int fast =n;

        do {
            slow=square(slow);
            fast=square(square(fast));
        }while (slow!=fast);
        if (slow==1){
            return true;
        }
        return false;
}
private  static int square(int num){
        int ans=0;
        while (num>0){
           int rem= num%10;
            ans+=rem*rem;
           num= num/10;
        }
        return ans;
}

    public static int LengthCycle(Node head){
        Node fast=head;
        Node slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                Node temp =slow;
                int length=0;
                do {
                    temp=slow.next;
                    length++;
                }while (temp!=slow);
            return length;
            }
        }
        return 0;
    }


}
