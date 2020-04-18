package javatraining.oletsky.arrays;

/**
 * @author O.Oletsky
 * A programmer wants to set all elements of an array to new values.
 * But there is a mistake in this code. Try to fix it
 */
public class ForeachTrap {
    public static void main(String[] args) {
        int[] mas = {1, 5, 7};
        for (int m : mas) {
            m = 0;
        }
        for (int i : mas) {
            System.out.println(i);
        }


    }
}
