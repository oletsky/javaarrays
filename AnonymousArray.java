package javatraining.oletsky.arrays;

/**
 * @author O.Oletsky
 *
 * Finding the middle element in an array
 *
 * What happens if there is no middle element?
 * Can we make this function more universal?
 */
public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println
                (getMiddle(new int[] {5, 10, 8, 3, 1}));
    }
    
    static int getMiddle(int[] m) {
        return m[m.length/2];
    }
}
