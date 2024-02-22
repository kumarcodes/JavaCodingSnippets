package javacodes;

public class Factorial {

    public static void main(String[] args) {

        int n = 10;
        int fact = n;
        for(int i=1; i<n;i++){
            fact = fact*(n-i);
        }
        System.out.println("Factorial of: "+n+"is:"+fact);

    }
}
