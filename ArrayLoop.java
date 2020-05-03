package javatraining.oletsky.arrays;

/**
 * @author O.Oletsky
 * Illustrating typical iterations through arrays
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("-------------");
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
}
