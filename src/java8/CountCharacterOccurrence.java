package java8;
/*
  Author: Rohit Sharma.
  Date: 12/03/24
  Time: 05:06 PM
  Problem Statement: Given a string, count the occurence of each character in it.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Long> frequencyMap = Arrays.stream(input.split(""))
                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
