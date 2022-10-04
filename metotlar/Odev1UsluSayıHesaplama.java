package metotlar;

import java.util.Scanner;

public class Odev1UsluSayıHesaplama {

    static int pow(int a, int b ) {

        if (b == 0) return 1;
        return a * pow(a, b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı girniz: ");
        int a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int b = input.nextInt();

        System.out.println(pow(a, b));
    }
}
