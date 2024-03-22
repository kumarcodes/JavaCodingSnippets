package java8;

/*
  Author: Rohit Sharma.
  Date: 22/03/24
  Time: 05:06 PM
  Problem Statement: Given a list of integers, find out all the numbers starting with 1 using Stream functions.
 */


import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(21, 12, 1, 7, 18, 9, 90, 801, 203, 103);
        numberList.stream()
                .map(num -> num + "")//Convert List into String to use StartsWith Method.
                .filter(num -> num.startsWith("1"))
                .forEach(System.out::println);
    }
}
