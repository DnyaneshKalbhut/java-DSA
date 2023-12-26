package KunalDSAsheet.ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List result = new ArrayList<>();
        int maxCandy =0;
        for(int i = 0 ; i < candies.length; i++){
            maxCandy = Math.max(maxCandy,candies[i]);
        }
        for(int i = 0 ; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
