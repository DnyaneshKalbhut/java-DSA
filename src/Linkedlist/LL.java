package Linkedlist;

public class LL {

    private Node head ;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val , int index){

        if (index==0){
           insertFirst(val);
           return;
        }
        if (index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node =new Node(val ,temp.next);
        temp.next=node;
        size++;

    }
     public int deletefirst(){
          int value = head.val;
          if (head==null){
              tail=null;
          }
          head=head.next;
          size--;
          return value;
            }

            public int deleteLast(){
             if (size<=1){
             return deletefirst();
             }
             Node secondLast = get(size-2);
             int value = tail.val;
             tail=secondLast;
             tail.next=null;
             size--;

             return value;
            }

            public int delete(int index) {
                if (index == 0) {
                    return deletefirst();
                }
                if (index == size - 1) {
                    return deleteLast();
                }

                Node prev = get(index-1);
                int value = prev.next.val;

                prev.next=prev.next.next;
                return value;
            }

            public Node get(int index){
            Node node = head;
                for (int i = 0; i < index ; i++) {
                 node=node.next;
                }
            return node;
            }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+ " -->" );
            temp=temp.next;
        }
        System.out.print("end");
    }

    public void insertRec(int val,int index){
      head= insertRec(val,index,head);
    }
    private Node insertRec(int value , int index, Node node){
        if (index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
      node.next=insertRec(value,index--,node.next);
        return node;
    }

    private class Node{
       private int val ;
       private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    //questions

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //question2
    public static LL merge(LL first, LL second){
        Node f=first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f.next!=null && s.next!=null){
            if (f.val<s.val){
          ans.insertLast(f.val);
            f= f.next;
            }else {
              ans.insertLast(s.val);
              s=s.next;
            }
        }

        while (f.next!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        while (s.next!=null){
            ans.insertLast(s.val);
            s=s.next;
        }
        return ans;
    }

    //find middle

    public static Node middleNode(Node head){
        Node f =head;
        Node s =head;
        while (f!=null &&f.next!=null){
            f = f.next.next;
            s=s.next.next;
        }
        return s;
    }

    //reverse a linkedList by recursion

     public  void reverseLL(Node node){
        if (node==tail){
            node=head;
            return;
        }
        reverseLL(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    //iterative method
    public Node reverse(Node node){
        if (size<2){
            return node;
        }
        Node prev=null;
        Node present=head;
        Node next = present.next;

        while (prev.next!=null){
            present.next=prev;
            prev=present;
            if (next!=null){
                next=next.next;
            }
        }
        return prev;
    }

    //is palondrone
    public boolean isPlalindrome(Node head){

        Node mid = middleNode(head);
        Node secHead=reverse(mid);
        Node reReverseHead=secHead;

        while (head!=null && secHead!=null){
            if (head.val!=secHead.val){
                break;
            }
            head=head.next;
            secHead=secHead.next;
        }
        reverse(reReverseHead);
        if (head==null&& secHead==null){
            return true;
        }
        return false;
    }


    //reorde list
    public void reorder(Node node){
        if (head==null || head.next==null){
            return;
        }

        Node mid = middleNode(head);
        Node hs=reverse(mid);
        Node hf=head;

        while (hf!=null && hs!=null){
            Node temp =hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }

        if (hf!=null){
            hf.next=node;
        }
    }


    //rotate LL
    public Node rotate(Node head ,int k){
        if (k<=0 || head==null || head.next==null){
            return head;
        }
        Node lst = head;
        int length=0;
        while (lst.next!=null){
            lst=lst.next;
        length++;
        }
        lst.next=head;

        int rotation = k%length;
        int skip =length-rotation;

       Node newLast=head;
        for (int i = 0; i <skip-1 ; i++) {
           newLast=newLast.next;
           head=newLast.next;
           newLast.next=null;
       }






        return head;
    }

    public static void main(String[] args) {
        LL list= new LL();
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(3);
//        list.display();
//        list.duplicates();
//        list.display();

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);

        LL second =new LL();
        second.insertLast(1);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(7);

        LL ans = LL.merge(first,second);
     ans.display();

    }
}
