package metotlar;

import java.util.Scanner;

public class Odev3DeseneGoreMetot {

    public static void Pattern(int pattern) {

        System.out.print(pattern + " ");

        if (0 < pattern) {
            Pattern(pattern - 5);
            System.out.print(pattern + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int pattern = scanner.nextInt();

        System.out.print("Pattern: ");
        Pattern(pattern);
    }
}
