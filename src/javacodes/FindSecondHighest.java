package javacodes;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //Using Normal Approach
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(secondLargest);

        //Using and stream API
        int result = Arrays.stream(arr).distinct().sorted().skip(n-2).
                findFirst().orElseThrow(() -> new RuntimeException("No such element found."));
        System.out.println(result);
    }
}
