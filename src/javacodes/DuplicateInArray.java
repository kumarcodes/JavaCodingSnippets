package collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 6, 4, 3, 2, 1, 5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : arr) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        for (Map.Entry entry : frequencyMap.entrySet()) {
            if ((int) entry.getValue() > 1)
                System.out.println(entry.getKey());
        }
    }
}
