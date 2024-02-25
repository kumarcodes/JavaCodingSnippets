package corejava;

public class StringContainsVowels {

    public static void main(String[] args) {


        String str = "Rohit";
        str = str.toLowerCase();
        boolean isVowel = false;
        //Approach One
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                isVowel = true;
                break;
            }
        }
        if (isVowel) {
            System.out.println("String contains vowel.");
        } else {
            System.out.println("String doesn't contains vowel.");
        }

        //Approach second Using Regex
        boolean regexIsVowel = str.matches(".*[aeiou].*");

        if (regexIsVowel) {
            System.out.println("String contains vowel using Regex.");
        } else {
            System.out.println("String doesn't contains vowel using Regex.");
        }

    }
}
