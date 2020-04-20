package javatraining.oletsky.arrays;

import java.util.Arrays;

/**
 * Illustration of == and Arrays.equals for arrays
 */

public class ArraysEquals {
    public static void main(String[] args) {
        int[] mas1 = {10, 20, 30, 40, 50};
        int[] mas2 = {10, 20, 30, 40, 50};
        System.out.println(mas1==mas2); //false
        System.out.println(Arrays.equals(mas1,mas2)); //true
    }
}
