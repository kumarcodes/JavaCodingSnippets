package corejava;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int length = 10;
        int first = 0;
        int second = 1;
        int third = 1;
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(first);
        fibonacciList.add(second);
        fibonacciList.add(third);
        int temp =1;
        int tempSecond =1;
        int result =0;
        for(int i=1; i<length-1; i++){
            result=tempSecond+temp;
            tempSecond=temp;
            temp=result;
            fibonacciList.add(result);
        }
        System.out.println(fibonacciList);
    }
}
