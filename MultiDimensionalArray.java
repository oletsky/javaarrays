package javatraining.oletsky.arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] mas = {
                {11,12,14,16},
                {21,24},
                {31,32,33,34,35}
        };
        System.out.println(mas[2][3]); //34
       // System.out.println(mas[2,3]); Syntax error
        for (int[] mm:mas) {
            System.out.println(mm.length);
        }

    }
}
