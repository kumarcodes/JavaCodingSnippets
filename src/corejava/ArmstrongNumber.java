package javacodes;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int numFinal = num;
        int tempNum = num;
        int temp = 0;
        int count = 0;
        int result = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        int last;
        while (tempNum > 0) {
            last = tempNum % 10;
            result += (int) Math.pow(last, count);
            tempNum = tempNum / 10;
        }
        if (result == numFinal)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
