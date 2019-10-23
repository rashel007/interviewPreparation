package Problems;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Find whether an array is a subset of another array
 */
public class Problem2 {

    public static void main(String[] args) {
        // write your code here

        int[] a = {2, 4, 1, 4, 7,9,90,80,76};
        int[] b = {2, 4, 1, 4, 4,9,90};

        System.out.println(checkIsSubset(a, b));
    }

    // solving using hashtable
    public static boolean checkIsSubset(int[] a, int[] b) {

        Map<Integer, Integer> hashTable = new HashMap<>();


        for (int i = 0; i < a.length; i++) {
            hashTable.put(i, a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if (!hashTable.containsValue(b[i])) {
                return false;
            }
        }

        return true;
    }


}

