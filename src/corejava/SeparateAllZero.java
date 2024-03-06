package javacodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SeparateAllZero {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 0, 6, 8, 0, 7, 3, 4, 0, 9};
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
