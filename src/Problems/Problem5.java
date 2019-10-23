package Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Count pairs with given sum
 * 
 */

public class Problem5 {


    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5, 8, 9, 2};

        countPairsSum(arr, 6);
    }

    public static void countPairsSum(int[] a, int sum) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (!hashMap.containsKey(a[i])) {
                hashMap.put(a[i], 0);
            }

            hashMap.put(a[i], hashMap.get(a[i]) + 1);
        }

        int twice_count = 0;

        for (int i = 0; i < a.length; i++) {

            if (hashMap.get(sum - a[i]) != null) {
                twice_count += hashMap.get(sum - a[i]);
            }

            if (sum-a[i] == a[i])
                twice_count--;
        }

        System.out.println(twice_count / 2);
    }
}
