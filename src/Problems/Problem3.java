package Problems;


/**
 * Find the minimum and maximum value in an array
 */
public class Problem3 {

    public static void main(String[] args) {
        int[] a = {3, 50, 2, 40, 1, 10};
        showMaxAndMin(a);
        showMaxAndMin2(a);
    }


    public static void showMaxAndMin(int[] a) {

        int max = a[0];
        int min = a[0];


        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max : " + max + ", Min : " + min);


    }

    //another method
//    {3, 50, 2, 40, 1, 10};
    public static void showMaxAndMin2(int[] a) {

        int max = a[0];
        int min = a[0];

        int i = 0;

        while (i < a.length) {

            if (a[i] > a[i + 1]) {
                if (max < a[i]) {
                    max = a[i];
                }
                if (min > a[i + 1]) {
                    min = a[i + 1];
                }

            } else {
                if (max < a[i + 1]) {
                    max = a[i + 1];
                }

                if (min > a[i]) {
                    min = a[i];
                }
            }

            i += 2;
        }

        System.out.println("Max : " + max + ", Min : " + min);

    }


}
