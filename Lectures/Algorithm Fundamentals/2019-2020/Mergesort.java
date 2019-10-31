/******************************************************************************
 *  Compilation:  javac Mergesort.java
 *  Execution:    java Mergesort N
 *  Dependencies: StdOut.java StdRandom.java
 *  URL: https://algs4.cs.princeton.edu/14analysis/Mergesort.java.html
 *  Generate N pseudo-random numbers between 0 and 1 and mergesort them.
 *  Modified For Educational Purposes By Rawand
 *  - Now uses the random class and prints arrays using java's built-in functions
 ******************************************************************************/

import java.util.Arrays;
import java.util.Random;
public class Mergesort {

    private static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                    c[k] = b[j++];
        }
        return c;
    }

    public static double[] mergesort(double[] input) {
        int N = input.length;
        if (N <= 1) return input;
        double[] a = new double[N/2];
        double[] b = new double[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = input[i];
        for (int i = 0; i < b.length; i++)
            b[i] = input[i + N/2];
        return merge(mergesort(a), mergesort(b));
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(double[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }



    // generate N real numbers between 0 and 1, and mergesort them
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] a = new double[N];
        Random ran = new Random();

        for (int i = 0; i < N; i++)
            a[i] = ran.nextDouble()*100;
        
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(a));    
        
        a = mergesort(a);

        System.out.print("\n\n");

        System.out.println("After Sort");
        System.out.println(Arrays.toString(a));
        System.out.print("\n\n");

        System.out.println("Is Array Sorted? >" + isSorted(a));
    }
}

