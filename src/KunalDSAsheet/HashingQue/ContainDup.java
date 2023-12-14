package KunalDSAsheet.HashingQue;

import java.util.HashMap;

public class ContainDup {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the map, it's a duplicate
            if (numMap.containsKey(num)) {
                return true;
            } else {
                // Otherwise, add it to the map
                numMap.put(num, 1);
            }
        }

        // No duplicates found
        return false;
    }
}
