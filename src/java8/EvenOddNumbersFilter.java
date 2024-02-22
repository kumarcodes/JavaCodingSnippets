package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numberList.stream().filter(num -> num % 2 == 0)
                .toList();
        System.out.println(evenNumbers);
        List<Integer> oddNumbers = numberList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
