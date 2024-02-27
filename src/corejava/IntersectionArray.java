package javacodes;

import java.util.Arrays;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {7, 8, 9, 10, 11, 12, 13};
        calculateUsingBruteForce(arr1, arr2);
        calculateUsingComparison(arr1, arr2);

    }

    private static void calculateUsingComparison(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }

    private static void calculateUsingBruteForce(int[] arr1, int[] arr2) {
        int[] result = new int[3];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    result[count] = arr2[j];
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
