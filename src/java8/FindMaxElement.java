package java8;

/*
  Author: Rohit Sharma.
  Date: 22/03/24
  Time: 05:06 PM
  Problem Statement: Given a list of integers, find the maximum value element present in it using Stream functions.
 */

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(21, 2, 32, 9, 18, 16, 33, 12, 3);
        int max = integerList.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
