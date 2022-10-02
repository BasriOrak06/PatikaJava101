package donguler;

import java.util.Scanner;

public class Pratik8YildizlarIleElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = (n - i -2); j > -1; j--) {
                System.out.print(" ");
            }
            for (int k = 2*i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
