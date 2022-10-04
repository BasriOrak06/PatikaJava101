package metotlar;

import java.util.Scanner;

public class Odev2AsalSayi {
    static boolean isPrime(int num, int i) {

        if (num <= 1) {
            System.out.println(num + " asal sayı değildir");
            return false;
        }
        if (num % i == 0) {
            System.out.println(num + " asal sayı değildir");
            return false;
        }
        if (i * i > num) {
            System.out.println(num + " asal sayıdır");
            return true;
        }
        return isPrime(num, (i + 1));
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girniz: ");
        num = input.nextInt();

        isPrime(num, 2);
    }
}
