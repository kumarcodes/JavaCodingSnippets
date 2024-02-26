package corejava;

public class RotationString {
    public static void main(String[] args) {
        String str1 = "RohitKumar";
        String str2 = "KumarRohit";
        String str3 = str1 + str1;
        if (str1.length() != str2.length()) {
            System.out.printf("str2 is not rotated version of str1");
        }
        else{
            if (str3.contains(str2)) {

                System.out.println("str2 is rotated version of str1");
            } else {
                System.out.println("str2 is not rotated version of str1 ");
            }
        }
    }
}
