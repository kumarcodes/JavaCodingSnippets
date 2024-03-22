package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 2, 3, 2, 6, 4, 5, 7, 1, 9, 8, 3, 3);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        List<Integer> resultList = integerList.stream()
                .filter(num -> !set.add(num))
                .filter(num -> set1.add(num))
                .toList();
        System.out.println(resultList);
    }
}
