package Problems;


import java.util.HashMap;
import java.util.Map;

/**
 * Check for pair in an array with a given sum
 * This means, we will have an array, and a value.
 * we have to find if there is a pair in that array which is equal to the value
 */
public class Problem4 {

    public static void main(String[] args) {

        //TODO:: need to fix this array pair issue
        int []a = {4,2,5,9,3};
        checkForPairSum(a, 10);
    }


    private static void checkForPairSum(int[] a, int sum) {

        Map<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < a.length; i++) {
            hashMap.put(i, a[i]);
        }


        for (int i = 0; i < a.length; i++) {
            int pairValue = sum - a[i];
            if (hashMap.containsValue(pairValue)) {
                System.out.println("Pair Found in array. paid is " + a[i] + " and " + pairValue);
                break;
            }
        }
    }

}
