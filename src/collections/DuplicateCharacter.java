package collections;

import java.util.HashMap;
import java.util.Map;

/*
Java Program  to Find Duplicate Character in a String
 */
public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "madam";
        str = str.toLowerCase();
        int n = str.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }
        //Iteration using EntrySet
        for (Map.Entry entry : freqMap.entrySet()) {
            if ((int) entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
        //Using Java 8 for Each loop.
        freqMap.forEach((key, value) -> {
                    if (value != 1) {
                        System.out.println(key);
                    }
                }
        );
    }
}
