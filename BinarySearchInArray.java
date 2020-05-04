package javatraining.oletsky.arrays;

import java.util.Arrays;

public class BinarySearchInArray {
    public static void main(String[] args) {
        int[] m = {1,23,51,4,5,8};
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        int ind = Arrays.binarySearch(m, 23);
        System.out.println(ind);

    }
}
