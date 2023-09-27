package Linkedlist;

public class Main {
    public static void main(String[] args) {
     LL list = new LL();
     list.insertFirst(3);
     list.insertFirst(5);
     list.insertFirst(12);
     list.insertFirst(75);
     list.insertLast(21);
     list.insert(54,3);
     list.display();
        System.out.println(list.deletefirst());
     list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        list.insertRec(23,2);
        list.display();


//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(12);
//        list.insertFirst(75);
//        list.insertLast(23);
//        list.display();


//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(21);
//        list.insert(43);
//        list.insert(256);
//        list.display();
    }
}
