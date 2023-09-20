package Recursion;

public class skipApp {
    public static void main(String[] args) {
        System.out.println(skipappnotApple("bccappbs"));
    }
    static  String skipappnotApple(String  up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") & !up.startsWith("apple")){
         return    skipappnotApple(up.substring(3));
        }else {
            return up.charAt(0)+ skipappnotApple(up.substring(1));
        }

    }
}
