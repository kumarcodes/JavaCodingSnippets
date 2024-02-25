package corejava;

public class CheckPalindromeString {

    public static void main(String[] args) {


        String str = "MadAM";
        str = str.toLowerCase();
        int n = str.length();
        boolean isPalindrome = true;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                isPalindrome = false;
                break;
            }
            else {
                continue;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
