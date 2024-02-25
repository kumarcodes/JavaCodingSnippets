package javacodes;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
