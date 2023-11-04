package BitManupulation;

public class BitMethods {

    public static void main(String[] args) {
//get bit
int n = 5; //0101
        int pos =2;
        int bitMask = 1<<pos;

        if ((bitMask & n) ==0){
            System.out.println("Zero");
        }else {
            System.out.println("one");
        }
        //set bit

        int num = 5 ;
        int position= 1 ;
        int bitmask = 1 << position;

        int newNum = bitmask | num;
        System.out.println(newNum);

        //clear bit

        int a = 5;
        int po = 2;
        int Bitmask = 1<< po;
        int NotBitmask = ~(Bitmask);

        int newA = NotBitmask & a;
        System.out.println(newA);
    }



}
