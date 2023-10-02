package StackandQueue;

public class CustomStack {
    protected int[]data;
    private static final int Default_size=10;
    int ptr =-1;

    public CustomStack() {
        this(Default_size);
    }

    public CustomStack(int size) {
      this.data=new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
         return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }

    public int pop () throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }
       return data[ptr--];
    }

    private boolean isEmpty() {
    return ptr==-1;
    }

    public int peak() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

}
