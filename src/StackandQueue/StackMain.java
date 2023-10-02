package StackandQueue;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);

          stack.push(23);
          stack.push(3);
          stack.push(2);
          stack.push(213);
          stack.push(232);
          stack.push(232);
          stack.push(232);
          stack.push(232);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
