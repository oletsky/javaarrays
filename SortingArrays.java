package javatraining.oletsky.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author O.Oletsky
 * Sorting arrays
 */

public class SortingArrays {
    public static void main(String[] args) {
        String[] arr = {"fffff","aaa","zzzz","qqqqqqq","ll"};
        //Sorting
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Reverse order
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        //Sorting by length
        Arrays.sort(arr,(s1,s2)->(s1.length()-s2.length()));
        System.out.println(Arrays.toString(arr));
    }
}
