package Recursion;

import com.sun.jdi.ArrayReference;

import javax.sound.sampled.spi.AudioFileReader;
import java.util.ArrayList;
import java.util.SplittableRandom;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> ans = permutationList("","abc");
        System.out.println(ans);
        System.out.println(permutationCount("","abc"));
    }


    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            list.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return list;
    }


    static int permutationCount(String p ,String up){
    if (up.isEmpty()){
        return 1;
    }
        int count =0;
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count = count+ permutationCount(f+ch+s , up.substring(1));
        }

        return count;
    }

}
