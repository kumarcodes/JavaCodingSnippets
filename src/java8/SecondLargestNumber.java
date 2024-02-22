package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(21, 25, 23, 14, 65, 61, 77, 18, 19, 110);
        Integer result = numberList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("No Second Largest Number Found"));
        System.out.println(result);
    }
}
