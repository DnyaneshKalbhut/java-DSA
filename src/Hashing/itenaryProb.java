package Hashing;

import java.util.HashMap;

public class itenaryProb {
    public static void main(String[] args) {
        HashMap<String ,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)){
            System.out.print(start);
            start=tickets.get(start);
        }
        System.out.print(start);
    }

    private static String getStart(HashMap<String, String> tickets) {
  HashMap<String ,String > revMap =new HashMap<>();
        for (String key:
             tickets.keySet()) {
            revMap.put(tickets.get(key),key);
        }

        for (String key :
                tickets.keySet()) {
            if (!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
}
