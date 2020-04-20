package javatraining.oletsky.arrays;

/**
 * @author O.Oletsky
 * Arrays are not entirely covariant.
 * This code will cause an exception
 */
public class ArraysCovariance {
    public static void main(String[] args) {
        String[] sarr = {"aa","bb","cc"};
        Object[] obarr = sarr;
        System.out.println("Assignment performed");
        obarr[0] = new Object(); //ArrayStoreException
        System.out.println("Now it is not a string array");

    }
}
