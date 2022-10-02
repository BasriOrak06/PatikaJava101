package donguler;

import java.util.Scanner;

public class Pratik3DortVeBesinKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        System.out.println("Girilen sayıya kadar dördün kuvvetleri: ");
        for (int i = 1; i < number; i *= 4) {    // Girilen sayıya kadar dendiği için i <= number yazmadım

            System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar beşin kuvvetleri: ");
        for (int j = 1; j < number; j *= 5) {
            System.out.println(j);
        }
    }
}
