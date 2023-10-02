package StackandQueue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(12);
        queue.insert(34);
        queue.insert(54);
        queue.insert(19);
        queue.insert(112);

        queue.display();
        System.out.println( );
    }
}
