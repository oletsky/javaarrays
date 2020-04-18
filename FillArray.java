package javatraining.oletsky.arrays;

import java.util.Scanner;

/**
 * @author O.Oletsky
 * What happens if we try to output the array by foreach?
 * Try to replace arrays with collections
 */
public class FillArray {
    public static void main(String[] args) {
        int[] mas=new int[100];
        int n=0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<100; i++) {
            System.out.println("Enter new number:");
            String qS=null;
            int q=0;
            try {
                qS = scanner.nextLine();
                q=Integer.parseInt(qS);
                if (q<0) {
                    throw new RuntimeException();
                }
                if (q==0) break;
                mas[n] = q;
                n++;
            }
            catch (Exception e) {
                System.out.println("Please enter correct data");
                continue;
            }


        }
        if (n==0) System.out.println("Array is empty");
        else {
            System.out.println("Length is "+n);
            for (int i = 0; i < n; i++) {
                System.out.print(mas[i] + " ");

            }
        }
    }
}
