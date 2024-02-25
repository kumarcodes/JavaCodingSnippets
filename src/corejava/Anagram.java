package corejava;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "rohit";
        String str2 = "hitrok";
        boolean isAnagram;
        boolean isAnagramMap;
        isAnagram = areAnagramUsingSorting(str1, str2);
        isAnagramMap = areAnagramUsingMap(str1, str2);
        if (isAnagramMap)
            System.out.println("The two strings are Anagram.");
        else
            System.out.println("The two strings are NOT Anagram.");

    }

    //Using HashMap
    private static boolean areAnagramUsingMap(String str1, String str2) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        for (char ch : str2.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) - 1);
            } else {
                return false;
            }
        }
        for (Map.Entry entry : frequencyMap.entrySet()) {
            if ((int) entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }


    private static boolean areAnagramUsingSorting(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int n = str1.length();
        int m = str2.length();
        boolean isAnagram = true;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (n != m) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
