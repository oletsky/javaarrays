package javatraining.oletsky.arrays;

import java.util.Arrays;

/**
 * @author O.Oletsky
 *
 * Illustration of copying arrays and of the difference between
 * = and Arrays.copyOf()
 */

public class CopyingArray {
    public static void main(String[] args) {
        int[] mas = {10, 20, 30, 40, 50};
        //Trying =
        int[] mas1 = mas;
        mas1[0]=100;
        System.out.println(Arrays.toString(mas));

        //Restoring
        mas[0]=10;

        //Using Arrays.copyOf
        int[] mas2 = Arrays.copyOf(mas,mas.length);
        mas2[0]=1000;
        System.out.println(Arrays.toString(mas));

    }
}
