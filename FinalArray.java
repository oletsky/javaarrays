package javatraining.oletsky.arrays;

/**
 * @author O.Oletsky
 * Demonstration of the final modifier
 * applied to an array
 */
public class FinalArray {
    public static void main(String[] args) {
        final int[] m1 = {5,8,23};
        //m1=null; //Syntax error
        m1[1]=18; //Ok
        System.out.println(m1[1]);

    }
}
