package Problems;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Short an array in ascending (small to large) and descending (large to small)
 */
public class Problem1 {

    public static void main(String[] args) {
        // write your code here


        shortAscending();
        shortDesending();
    }

    private static void shortAscending() {

        int[] arr = {2, 4, 9, 90, 80, 76};


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void shortDesending() {
        int[] arr = {2, 4, 9, 90, 80, 76, 90};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}

